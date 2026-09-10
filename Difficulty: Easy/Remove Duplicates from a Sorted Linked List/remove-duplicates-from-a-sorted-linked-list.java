/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // code here
        // first of all check linked list is not empty 
        if(head == null){
            return head;
        }
        // check list me ek he node to nahi he 
        if(head.next == null){
            return head;
        }
        // if linked list me node 1 se jada ho to 
        Node prev = head;
        Node curr = head.next;
        
        while(curr != null){
            if(prev.data != curr.data){
                // do not need to delete 
                curr = curr.next;
                prev = prev.next;
            }
            else{
                // nahi to 
                // ise delete ho gayega 
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        // iske bad 
        return head;
    }
}