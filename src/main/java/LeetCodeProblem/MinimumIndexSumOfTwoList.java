package LeetCodeProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class MinimumIndexSumOfTwoList {

    public static void main(String[] args) {
        String[] list1 = new String[]{"happy","sad","good"};
        String[] list2 = new String[]{"sad","happy","good"};
        String[] minSumList = findMinimumIndexSum(list1, list2);
        for(String s: minSumList){
            System.out.print(s+" ");
        }

    }

    public static String[] findMinimumIndexSum(String[] list1,String[] list2){
        //use 1 linkedHM , to store by preserve order
        //HM1 [(happy,0), (sad,1), (good,2)] ,list2 [sad,happy,good]
        //minSum >= sum(both)1, add into new list

        HashMap<String,Integer> Lhm1 = new HashMap<>();
        for(int i=0; i<list1.length; i++){
            Lhm1.put(list1[i],i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        int total = 0;

        for(int i=0; i<list2.length; i++){
            if(Lhm1.containsKey(list2[i])){
                total = i+Lhm1.get(list2[i]);

                if(total < minSum){
                    result.clear();
                    result.add(list2[i]);
                }else if(total == minSum){
                    result.add(list2[i]);
                }
                minSum = Math.min(minSum,total);
            }
        }

        String[] ans = new String[result.size()];

        for(int i=0; i<ans.length; i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}
