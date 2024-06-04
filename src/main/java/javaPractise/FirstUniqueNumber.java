package javaPractise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstUniqueNumber {

    Set<Integer> unique = new LinkedHashSet<>();
    Set<Integer> all = new HashSet<>();

    public static void main(String[] args) {
        FirstUniqueNumber fq = new FirstUniqueNumber(new int[]{2,3,5});
        System.out.println(fq.showFirstUnique());
        fq.add(2);
        System.out.println(fq.showFirstUnique());
        fq.add(3);
        fq.add(5);
        System.out.println(fq.showFirstUnique());

    }

    public FirstUniqueNumber(int[] nums){

        for(int num : nums){
            add(num);
        }

    }
    public int showFirstUnique(){
        if(unique.isEmpty()){
            return -1;
        }
        return unique.iterator().next();
    }
    public void add(int value){

        if(all.add(value)){
            unique.add(value);
        }else {
            unique.remove(value);
        }
    }



}
