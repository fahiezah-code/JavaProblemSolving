package LeetCodeProblem;

import java.util.ArrayList;
import java.util.List;

public class findMaxkHasNegativeValue {

    public static void main(String[] args) {
        int[] nums = new int[]{-10,8,6,7,-2,-3};
        findMaxK(nums);

    }
    public static void findMaxK(int[] arr){
        //find number which has negative value,
        //add into list
        //find max value from the list
        // -1,2,-3,3
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){  //<4
                if(arr[i]*-1 == arr[j]){
                    ls.add(arr[i]);
                    ls.add(arr[j]);
                }
            }
        }

        if(ls.size() > 0){
            int max =0;
            for(int k : ls){
                max = Math.max(max,k);
            }
            System.out.println(max);
        }else System.out.println("-1");


    }
}
