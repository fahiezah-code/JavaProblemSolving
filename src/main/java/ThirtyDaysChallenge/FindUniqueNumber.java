package ThirtyDaysChallenge;

import java.util.HashMap;

public class FindUniqueNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{7,1,3,1,3};
        int result = checkSingleNumber(arr);
        System.out.println(result);

    }

    public static int checkSingleNumber(int[] arr){

        //use Map, to store value and its count

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else {
                hm.put(arr[i],1);
            }
        }
        for(int key : hm.keySet()){
            if(hm.get(key)<2){
                return key;
            }
        }
        return -1;
    }
}
