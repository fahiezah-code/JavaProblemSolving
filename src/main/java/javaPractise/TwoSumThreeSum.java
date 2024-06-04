package javaPractise;

import java.util.*;

public class TwoSumThreeSum {

    public static void main(String[] args) {

        int[] arr = new int[]{2,5,7,9};
      //twoSum(arr,9);
       // twoSumByHashMap(arr,9);
       twoSumByPointers(arr,9);
       threeSumByPointers(new int[]{-1,0,1,2,-1,-4});
    }

    //brute force
    public static void twoSum(int[] arr, int targetValue){
       //find complementValue =  targetValue - arr[0], targetValue-[arr1]
        // loop comlementValue [i+1], [i+2]...arr.length-1
        int[] result = new int[2];
        int complementValue;
        for(int i=0; i<arr.length; i++){
            complementValue = targetValue - arr[i];
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[j] == complementValue){
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        for(int i : result){
            System.out.print(i + " ");
        }
    }

    //used hashmap
    public static int[] twoSumByHashMap(int[] arr, int target){
        //create hashmap
        //find compValue = target - arr[i],
        // contains comValue in Map? return i,map[i] : add into map(arr[i],i)
        int[] result = new int[2];
        Map<Integer,Integer> hmap = new HashMap<>();
        int comValue;
        for(int i=0; i<arr.length; i++){
            comValue = target - arr[i];
            if(hmap.containsKey(comValue)){
                result[0] = i;
                result[1] = hmap.get(comValue);
                for(int num : result){
                    System.out.println(num);
                }
                return result;
            }else {
                hmap.put(arr[i],i); //2,0 5,1  2
            }
        }

        return new int[]{-1};
    }

    //two pointers  int left = 0; int right = arr.length-1
    //** sort the array         1,2,5,7,9
    // sum = left[] + right[]  , target=9
    // if (target == sum) return left,right
    //if (target < sum ) right--
    //if ( target > sum) left++
    public static int[] twoSumByPointers(int[] arr, int target){
        int sum = 0;
        int left = 0; int right = arr.length-1;
        Arrays.sort(arr);//****
        int[] result = new int[2];
        while(left < right){
            sum = arr[left] + arr[right];
            if(target == sum){
                result[0]=left;
                result[1]=right;
                for(int k : result){
                    System.out.println(k);
                }
                return result;
            }
            if(target < sum){
                right--;
            }else {
                left++;
            }
        }
       return new int[]{-1};
    }

    public static List<List<Integer>> threeSumByPointers(int[] arr){
        if(arr == null || arr.length<3) return new ArrayList<>();

        //sort the elements
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        //fix the first element and find the other two elements
        for(int i=0; i< arr.length-2; i++){

            //find the two elements using two Sum approach
            int left = i+1;
            int right = arr.length-1;

            while(left<right){
                int sum = arr[i] + arr[left]+ arr[right];
                if(sum == 0) {
                    //Add the set, and move to find other triplets
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }else if(sum < 0)
                    left++;
                else
                    right--;
                }
            }
        for(List<Integer> n : result){
            System.out.print(n+" ");
        }
        return new ArrayList<>(result);
    }


}
