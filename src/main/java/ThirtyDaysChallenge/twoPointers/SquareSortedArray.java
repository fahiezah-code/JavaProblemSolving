package ThirtyDaysChallenge.twoPointers;

import java.util.Arrays;

/*
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */
public class SquareSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
       int[] result = byTwoPointer(nums);
        for(int num :result ){
            System.out.print(num+" ");
        }
            //-4 => 16 , 10 => 100 -> 16 <= 100
        //int index = n-1; 5-1 = 4 result[4]=100, right --
        // 16 >= 9 result[3]=16 left++
        // 1 <= 9 result[2] = 9
        // 1 >= 0 result[1] = 1
        // left <= right -stop
       

    }
    public static int[] sortedSquares(int[] nums){
        int[] sorted = new int[nums.length];
        for(int i=0; i< nums.length; i++){
            sorted[i] = nums[i] * nums[i];
        }
        Arrays.sort(sorted);
        return sorted;
    }

    public static int[] byTwoPointer(int[] nums){

        int[] sorted = new int[nums.length];

        //two pointer
        int left = 0; int right = nums.length-1;

        //to enter value into sorted array,
        //use one more index
        int index = nums.length-1;

        //loop till while (left <= right)
        while (left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare >= rightSquare){
                sorted[index] = leftSquare;
                left++;
            }else {
                sorted[index] = rightSquare;
                right--;
            }
            index--;
        }
        return sorted;

    }
}
