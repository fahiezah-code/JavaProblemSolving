package javaPractise;

import java.util.HashMap;

public class LRUCache{
    Node head;
    Node tail;
    HashMap<Integer, Node> map = null;
    int cap = 0;
        /*
        In constructor, Initialize capacity and create the object of HashMap.
         */
    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        // map[k1 -> v1] O(1)
        //
        // [k4->v4, k5->v5, k2->v2, k6-> v6, k3->v33, k7->v7] o(N)
        //    h
        //                                                 t
    }
    public int get(int key) {
            /*
            If key is found in a map then
            move it to the front, Else return -1.
             */
        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            putOnTop(node);

            return node.value;
        }
        return -1;
    }
    public void put(int key , int value) {
            /*
            if key is present, update it value;
            Then move that node at the head
             */
        if (map.containsKey(key)) {
            Node t = map.get(key);
            t.value = value;

            removeNode(t);
            putOnTop(t);
        } else {
                /*
                If max capacity is reached then remove;
                Lease accessed record
                 */
            if (map.size() >= cap) {
                map.remove(tail.key);
                removeNode(tail);
            }
            //add new node into map after removing least recent used
            Node node = new Node(key, value);
            map.put(key, node);
            putOnTop(node);
        }
    }

    private void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        if (prevNode != null) {
            prevNode.next = node.next;
        } else {
            head = nextNode;
        }
        if (nextNode != null) {
            nextNode.prev = prevNode;
        } else {
            tail = prevNode;
        }
    }

    private void putOnTop(Node node) {
        node.next = head;
        node.prev = null;

        if (head != null)
            head.prev = node;

        head = node;

        if (tail == null) {
            tail = node;
        }
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(3);

        cache.put(1,3);
        cache.put(4,2);

        System.out.println(cache.get(1));

        cache.put(5,6);
        System.out.println(cache.get(7));
        System.out.println(cache.get(5));

        cache.put(7,4);

        System.out.println(cache.get(4));

        System.out.println(cache.get(1));
        System.out.println(cache.get(5));
    }

}
