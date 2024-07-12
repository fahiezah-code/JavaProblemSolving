package javaPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractise {
    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(11);
        ls.add(3);
        ls.add(7);
        ls.add(9);
        ls.add(6);
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println("After sort" + ls);
        for (int i : ls) {
            System.out.print(i);
        }
        Iterator<Integer> it = ls.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}