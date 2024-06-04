package LeetCodeProblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneDestinationCity {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("London");
        l1.add("New York");
        List<String> l2 = new ArrayList<>();
        l2.add("New York");
        l2.add("Lima");
        List<String> l3 = new ArrayList<>();
        l3.add("Lima");
        l3.add("Sao Paulo");

        List<List<String>> finalList = new ArrayList<>();
        finalList.add(l1);
        finalList.add(l2);
        finalList.add(l3);

        System.out.println(finalList.size());
        for(List<String> ls : finalList){
            System.out.println(ls);
        }
        System.out.println(getFinalDestination(finalList))
        ;

    }

    public static String getFinalDestination(List<List<String>> paths){

        Set<String> setSource = new HashSet<>();
        for(int i=0; i<paths.size(); i++){
            setSource.add(paths.get(i).get(0));
        }
        String finalDestination = "";
       for(int i=0; i<paths.size(); i++){
           String destination = paths.get(i).get(1);
           if(!setSource.contains(destination)){
                finalDestination = destination;
           }

       }
        return finalDestination;
    }



}
