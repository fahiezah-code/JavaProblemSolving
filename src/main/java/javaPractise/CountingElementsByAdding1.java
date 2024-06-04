package javaPractise;

import java.util.HashSet;
import java.util.Set;

public class CountingElementsByAdding1 {

    public static void main(String[] args) {
        System.out.println(countElements(new int[]{1,2,1,2,3}));

    }

    public  static int countElements(int[] arr){

        Set<Integer> set = new HashSet<>();
        for(int n : arr){
            set.add(n);
        }
        int count = 0;
        for(int i=0; i< arr.length; i++){
            if(set.contains(arr[i]+1)){
                count++;
            }
        }
        return count;
    }

}
