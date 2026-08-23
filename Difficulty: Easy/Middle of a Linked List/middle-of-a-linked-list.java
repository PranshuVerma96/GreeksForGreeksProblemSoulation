/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        // step 1 find the size
        int size =0;
        Node temp = head;
        
        while(temp != null){
            size++;
            temp = temp.next;
        }
        // step 2 second millde ke liye 
        int middle = size/2;
        
        temp = head;
        
        for(int i=0; i<middle; i++){
            temp = temp.next;
        }
        return temp.data;
    }
}