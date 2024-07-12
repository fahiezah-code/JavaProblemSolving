package ThirtyDaysChallenge.twoPointers;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};

        //brute force
        int[] mergeArray = new int[num1.length + nums2.length];
        for(int i=0; i< num1.length; i++){
            mergeArray[i] = num1[i];
        }
        for(int i=0; i< nums2.length; i++){
            mergeArray[i + num1.length] = nums2[i];
        }
        Arrays.sort(mergeArray);
        for(int a : mergeArray){
            System.out.print(a +" ");
        }




    }
    public static void mergeTwoArrays(int[] nums1, int[]nums2, int m, int n ){
        // 3 pointers
        int p = m+n -1;
        int p1 = m-1;
        int p2 = n-1;

        while(p1 >= 0 && p2 >=0){

        }

    }
}
