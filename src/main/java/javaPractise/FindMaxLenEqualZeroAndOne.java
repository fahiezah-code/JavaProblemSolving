package javaPractise;

import java.util.HashMap;

public class FindMaxLenEqualZeroAndOne {

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,1,1,0,0};
        findMaxLenByBruteForce(arr);
        findMaxLenByHM(arr);

    }
    //trick is
    // sum=0, whenever we found 0 -> subtract -1, || 1 -> add +1
    //initialize Map( sum,-1)
    //find sum value in Map, if current sum value in Map ,take Max ( maxlen, i- map.get(sum))
    // else add into map (sum, i)

    public static void findMaxLenByHM(int[] arr){
        //Declare a HM and initialize with 0 sum and index -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int sum = 0;
        int maxLen = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] == 0){
                sum += -1;
            }else{
                sum += 1;
            }

            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i - map.get(sum));
            }else {
                map.put(sum,i);
            }
        }

        System.out.println(maxLen);
    }

    public static int findMaxLenByBruteForce(int[] arr){

        // 1,0,1,1,1,0,0
        //   i
        //   j

        // find countOne , countZero
        // if(countOne == countZero) -> maxLength = Math.max( maxLen, j-i+1) // (j->end) -(i ->start)

        int maxLength = 0;
        for(int i=0; i<arr.length; i++){
            int countOne = 0; int countZero = 0; // this place is important
            for(int j=i; j<arr.length; j++){
                if(arr[j] == 0){
                    countZero++;
                }else {
                    countOne++;
                }
                if(countOne == countZero){
                    maxLength = Math.max(maxLength, j -i + 1);
                }
            }
        }
        System.out.println(maxLength);
        return maxLength;
    }

}
