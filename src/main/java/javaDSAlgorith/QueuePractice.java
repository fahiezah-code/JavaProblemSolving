package javaDSAlgorith;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/*
Given a collection of stones, each stone has a positive integer weight

Each turn, we choose the two heaviest stones and smash them together
Suppose the stones have weights x & y with x <= y. the result of this smash is:

If x==y, both stones are equally destroyed.
if x !=y, the stone of weight x is totally destroyed and the stone of weight y has new weight y-x

At the end there is at most 1 stone left.
Return the weight of this stone (or 0 if there are no stones left)
Input: {2,7,4,1,8,1}
output: 1
 */
public class QueuePractice {

    public static int getLastStoneWeight(int[] stones){
        //FIFO & top by priority
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //to get max on the top by reverse
        for(int i : stones){
            pq.add(i);
        }

        while(pq.size()>1){
          pq.add(pq.poll() - pq.poll());
        }
     return pq.peek();
    }

    public static void main(String[] args) {

        int[] stones = new int[]{2,7,4,1,8,1};
        System.out.println("last stone weight: "+ getLastStoneWeight(stones));



        Queue<String> lsQueue = new LinkedList<>();
        lsQueue.offer("Minecraft");
        lsQueue.offer("skyrim");
        lsQueue.offer("Doom");
        lsQueue.offer("Borderlands");

        System.out.println("Standard queue will do FIFO"); //
        while(!lsQueue.isEmpty()){
            System.out.println(lsQueue.poll());
        }
        //remove First/Top
        //lsQueue.poll();
        //System.out.println(lsQueue);

        //return boolean
        System.out.println(lsQueue.contains("Doom"));

        //Priority Queue -> that serves elements with
        //high priorities first before elements with lower priority

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(3.0);
        pq.offer(2.5);
        pq.offer(4.0);
        pq.offer(1.5);
        pq.offer(2.0);
        System.out.println(pq);
    }
}
