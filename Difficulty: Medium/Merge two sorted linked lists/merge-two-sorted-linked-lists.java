/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
     Node dummy = new Node(0);
     Node curr = dummy;
     
     // loop check both are not empty 
     while(head1 !=null && head2!=null){
         if(head1.data <=head2.data){
             curr.next = head1;
             head1 = head1.next;
         }
         else{
             curr.next = head2;
            head2 = head2.next;
         }
         //  ye sab ho ne ke badd curr ko bada do 
         curr = curr.next;
     }
     
     if(head1 !=null){
         curr.next = head1;
     }
     else{
         curr.next = head2;
     }
     return dummy.next;
    }
}