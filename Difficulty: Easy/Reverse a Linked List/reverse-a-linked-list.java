/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        
        // check the conditon when conditon is not false 
        while(curr != null){
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        // after that return update head
        return prev;
    }
}