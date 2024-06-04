package javaDSAlgorith;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackPractice {
    //for retrieving min element in constant time

    Stack<Integer> mainStack;
    Stack<Integer>minStack;

    public StackPractice(){
        mainStack = new Stack();
        minStack = new Stack<>();

    }
//Declare 2 stacks. One is main stack in wich we push value as it is.
//In second stack, we only push the min element present at that time.

    //Design a stack that supports push, pop, top and retrieving the
    //minimum element in constant time

    /*
    push(x) - push element x onto stack
    pop() - removes the element on top of stack
    top() - get the top element
    getMin() - retrieve the minimum element
     */
    public void push(int x){
        mainStack.push(x);

        int min = x;
        if(!minStack.isEmpty() && min > minStack.peek()){
            min = minStack.peek();
        }
        minStack.push(min);
    }

    public void pop(){
        minStack.pop();
        mainStack.pop();
    }
    public int top(){
        return mainStack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }


    public static void main(String[] args) {

       StackPractice sp = new StackPractice();
        sp.push(3);
        sp.push(2);
        sp.push(1);
        sp.push(9);
        sp.push(2);

        System.out.println("main stack: "+sp.mainStack);
        System.out.println("min stack: "+sp.minStack);
        System.out.println("min value: "+sp.getMin());

        sp.pop();
        sp.pop();

        System.out.println("main stack: "+sp.mainStack);
        System.out.println("min stack: "+sp.minStack);
        System.out.println("min value: "+sp.getMin());


        LinkedList<String> lStack = new LinkedList<>();
        lStack.push("Minecraft");
        lStack.push("skyrim");
        lStack.push("Doom");
        lStack.push("Borderlands");
       // System.out.println(lStack);

        Queue<String> lsQueue = new LinkedList<>();
        lsQueue.offer("Minecraft");
        lsQueue.offer("skyrim");
        lsQueue.offer("Doom");
        lsQueue.offer("Borderlands");

      //  System.out.println(lsQueue);

        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("skyrim");
        stack.push("Doom");
        stack.push("Borderlands");

        //pop() top most object will be removed
      //  String topMostObject = stack.pop();//
      //  System.out.println("topMostObject: "+topMostObject);

        //peek() //topMostobject -it doesn't remove
       // String peekObject = stack.peek();
       // System.out.println(peekObject);
       // System.out.println(stack);
        // search ->it will count from topMost item
       int search = stack.search("Minecraft");
       // System.out.println("search item: "+search);

    }






















}
