package javaPractise;

//Lease recently used (oldest one) Cache --> when cache is full,
// --->remove value which is lease recently used in a cache

import java.util.HashMap;

class Node {
    int key;
    int value;
    Node next;
    Node prev;
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        /* here we can declare node as a null
        this.next = null;
        this.prev = null;
         */
    }
}




