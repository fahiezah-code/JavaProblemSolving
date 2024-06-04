package javaPractise;

import java.util.HashSet;
import java.util.Set;

public class ArrayPractices {
    public static void main(String[] args) {
//        printGrid(3,3);
//        findMaxMin(new int[]{2,3,5});
//        removeSpecificNumber(new int[]{2,3,5,9,1},3);
            findDuplicateValue(new int[]{2,2,3,5,9,1});
    }

    public static void printGrid(int rows, int cols) {

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("-"+" ");
            }
            System.out.println();
        }
    }

    public static void findMaxMin(int[] nums){
        //max=arr[0]-->2 , max//arr[1] max <arr[i+1] max= arr[1];{ 2,3,5}
        //min=arr[0]--2 , min >arr[i+1] min=arr[i+1]
        if(nums.length == 0){
            System.out.println("no max & min value");
            return;
        }

        int max = nums[0];
        int min = nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(max < nums[i+1]){
                max = nums[i+1];
            }
            if(min > nums[i+1]){
                min = nums[i+1];
            }
        }
        System.out.println("maximum number is "+ max);
        System.out.println("minimum number is "+ min);
    }

    public static void removeSpecificNumber(int[] nums, int findNum){
        // 0 1 2 3 4
        // 2 3 5 9 1
        // i
        // 2   5 9 1
        int[] result = new int[nums.length-1];
        int pos = 0;
        for(int i=0; i< nums.length;i++){ // i = 2
            if(findNum == nums[i]){ // 3, 5
                continue;
            }
            result[pos]=nums[i]; // res[2] = 5
            pos++;
        }
        for(int j : result){
            System.out.print(j+" ");
        }
    }

    public static int findDuplicateValue(int[] nums){

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(num)) {
                System.out.println(num);
                return num;
            }
            set.add(num);
        }
        return 0;
    }


}
