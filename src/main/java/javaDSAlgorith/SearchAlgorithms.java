package javaDSAlgorith;

import java.util.Arrays;

public class SearchAlgorithms {

    public static void main(String[] args) {

        int[] arr = new int[]{3,5,7,9,1,8,2,4,6}; // n9/2 =4
        //Linear Search
        int index = linearSearch(arr, 1);
        if(index != -1){
            System.out.println("LinearSearch: The value is found at index : "+index);
        }else
            System.out.println("The value is not found");
        //Binary Search
        int result = binarySearch(arr,1);
       if(result == -1){
           System.out.println("The value is not found");
       }else {
           System.out.println("BinarySearch: The value is found at index :"+ result);
       }

        selectionSort(arr);
    }

    //Linear Search algorithm
    public static int linearSearch(int[] arr, int value){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }


    //Binary Search --> 1. **need to sort, 2.find midIndex/midValue,
   // 3,5,7,9,1,8,2,4,6 -> sort -> 1,2,3,4,5,6,7,8,9
    public static int binarySearch(int[] arr, int value){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int midValue = 0; //5

        while(start <= end){
            int midIndex = (start+end)/2;
            midValue = arr[midIndex];

            if(value == midValue){
                return midIndex;
            }else if(value < midValue){
                end = midIndex -1;
            }else{
                start = midIndex + 1;
            }
        }
        return -1;
    }
    public static void selectionSort(int[] arr){
        //3,5,7,9,1,8,2,4,6
        //+
        // minValue = arr[i]
        // minValue > arr[i+1]? minVlaue = arr[i+1];
        //
        for(int i=0; i< arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }





}
