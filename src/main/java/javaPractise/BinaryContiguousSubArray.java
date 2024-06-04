package javaPractise;

import java.util.HashMap;
import java.util.Map;

public class BinaryContiguousSubArray {

    //** Run two for loop and make all possible subarrays
    //count num of zeros and ones in each subarray.
    //if both count is equal then keep track of max length
    //{1,0,1,1,1,0,0}
    // +
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,1,1,0,0};
        System.out.println(findMaxLengthBruteForce(arr));
        System.out.println(findMaxLengthByHMap(arr));
    }

    public static int findMaxLengthBruteForce(int[] arr){
        // 1 -> oneCount++ , 0 -> zeroCount++
        // if(oneCount == zeroCount)
        int maxLength = 0;

        for(int i=0; i<arr.length; i++){
            int oneCount = 0, zeroCount = 0;

            for(int j=i; j<arr.length; j++){
                if(arr[j] == 0){
                    zeroCount++;
                }else
                    oneCount++;
                if(zeroCount == oneCount){
                    maxLength = Math.max(maxLength,j - i +1);
                }
            }
        }
        return maxLength;
    }
    // map.put(sum, index)
    // if we found 0 -> sum += -1; 1 -> sum += 1;
    // if map.contains(sum) -> Math.max(maxLength, i-map.get(sum)
    // else mp.put(sum, i)
    public static int findMaxLengthByHMap(int[] arr){

        Map<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,-1);

        int sum = 0;
        int maxlength = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] == 0){
                sum += -1;
            }else
                sum += 1;
            if(hmap.containsKey(sum)){
                maxlength = Math.max(maxlength,i-hmap.get(sum));
            }
            else
                hmap.put(sum,i);
        }
        return maxlength;
    }
}
