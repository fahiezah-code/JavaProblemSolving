package javaDSAlgorith;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {
        LinkedList<String> llStack = new LinkedList<>();
        //work as Stack (FILO)
        llStack.push("A");
        llStack.push("B");
        llStack.push("C");
        llStack.push("D");
        llStack.push("F");
        llStack.poll();
        System.out.println("remove last one first : F");
        System.out.println("work as Stack (FILO): "+llStack);
        LinkedList<String> llQueue = new LinkedList<>();
        llQueue.offer("A");
        llQueue.offer("B");
        llQueue.offer("C");
        llQueue.offer("D");
        llQueue.offer("F");
        llQueue.poll();
        llQueue.add(3,"E");
        System.out.println("remove fist one First: A");
        System.out.println("work as Queue (LIFO): "+llQueue);
        System.out.println(llQueue.peekFirst());
        System.out.println(llQueue.peekLast());

        llQueue.addFirst("0");
        System.out.println(llQueue);


    }
}
