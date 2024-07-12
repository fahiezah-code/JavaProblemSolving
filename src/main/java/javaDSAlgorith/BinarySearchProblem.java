package javaDSAlgorith;

import java.util.Arrays;
import java.util.HashMap;

public class BinarySearchProblem {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,9,12,18,3};
       // System.out.println( binarySearch(arr,9));

        int result = findDuplicate(arr);
        System.out.println(result);
    }
    public static int binarySearch(int[] arr, int findValue){
        //*** first we need to SORT the array
        //int start =0, end = arr.length-1;
        // int middleIndex = (start+end)/2
        // int middleValue = arr[middleIndex]
        //if (middleValue == findValue) return middleIndex
        //else if(middleValue < findValue) -> end = middleIndex ->then we call function again
        //else (middleVlaue > findValue ) --> start = middleIndex --> we call function again
        Arrays.sort(arr);
        int start = 0; int end = arr.length-1;   // 0 -- 5
        while(start <= end){
            int midIndex = (start+end)/2;
            int midValue = arr[midIndex];
            if(findValue == midValue){
                return midIndex;
            }else if(findValue < midValue){
                end = midIndex - 1;
            }else {
                start = midIndex + 1;
            }
        }
        return -1;
    }

    public static int findDuplicate(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for( int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        for( int key : hm.keySet()){
            if(hm.get(key)>1){
                return key;
            }
        }
        return -1;
    }


}

