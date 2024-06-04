package javaPractise;

import java.util.Arrays;

public class ConsecutiveNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{23, -2, 45, 38, 12, 4, 6};
      //  checkIncreaseNum(arr);
        System.out.println(maxGap(arr));
    }

    public static void checkIncreaseNum(int[] arr){

        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
           if(arr[i+1] - arr[i] != 1 ) {
               System.out.println("this is not consecutive list");
             return;
            }
        }
        System.out.println("this is consecutive list");
    }

    //[23,-2, 45, 38, 12, 4, 6]
    //sorted -2,4,6,12,23,38,45
    //max = 0;
    // max < arr[i+1] - arr[i], max =arr[i+1] - arr[i]

    public static int maxGap(int[] arr){
        Arrays.sort(arr);
        int max = 0;
        for(int i=0; i<arr.length-1; i++){
            if(max < arr[i+1] - arr[i]) {
                max = arr[i+1] - arr[i];
            }
        }
        return max;
    }



}


