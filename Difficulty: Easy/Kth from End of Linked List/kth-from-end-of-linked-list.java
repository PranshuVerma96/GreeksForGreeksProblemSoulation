/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node prev = head;
        Node curr = head;
        
        if(curr == null){
            return -1;
        }
       int count = 0;
       while(curr != null){
           count++;
           curr = curr.next;
       }
       if(count <k){
           return -1;
       }
        
        curr = head;
        // curr ko abi k jumb kerbane he he 
        for(int i = 1; i<=k; i++){
            curr = curr.next;
        }
        // meri first window ready he 
        // I can move my window
        while(curr != null){
            curr = curr.next;
            prev = prev.next;
            
          
            
        }
          return prev.data;
        
    }
}