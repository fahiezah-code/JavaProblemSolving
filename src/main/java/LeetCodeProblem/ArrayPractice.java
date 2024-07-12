package LeetCodeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,64,24,5,5,6}; //2

        int[] newArry = new int[]{54,353,35,5,53,5343};

        System.out.println(findMaxAvgNumberByBruteForce(arr, 3));
        System.out.println(findMaxAvgSlidingWindow(arr, 3));

    }

    public static boolean findElement(int[] arr, int k){
        for (int j : arr) {
            if (j == k) {
                return true;
            }
        }
        return false;
    }


    public static int[] findMinMax(int[] arr){

        //2,3,1,6,7
        //+
        //max= 0
        //int max=0,
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        int[] result = new int[]{min,max};

        System.out.println(min);
        System.out.println(max);
        return result;

    }

    public static int findMaxAvgNumberByBruteForce(int[] arr, int size){
        //int[] arr = new int[]{1,2,3,8,9,10,12};
        //0 1 2 3 4  5 6
        //1,2,3,8,9,10,12
        //  i
        //      j
        int avg = 0;
        for (int i = 0; i <= arr.length - size; i++) { // O(n)
            int sum = 0;
            for(int j=i; j< i + size; j++){ // o(n) 1 + 3
                sum += arr[j];
            }
            avg = Math.max(avg, sum/size );
        }
       return avg;
    }

    public static int findMaxAvgSlidingWindow(int[] arr, int size){
        int avg = 0, sum = 0, j = 0;
        for(int i = 0; i< arr.length; i++){
            if(i < size){
                sum += arr[i];
            }else {
                avg = Math.max(avg, sum/size);
                sum += arr[i];
                sum -= arr[j++];
            }
        }
        return Math.max(avg,sum/size);
    }
}

/*
int avg = 0; int sum = 0; int j = 0;

        for(int i=0; i< arr.length ; i++) {
            if (i < size) {  // 2 < 3
                sum += arr[i];
            } else {
                avg = Math.max(avg, sum/size);
                sum += arr[i];
                sum -= arr[j++];
            }
        }
        return Math.max(avg, sum/size);
 */


// fun that take an array, and one int K


