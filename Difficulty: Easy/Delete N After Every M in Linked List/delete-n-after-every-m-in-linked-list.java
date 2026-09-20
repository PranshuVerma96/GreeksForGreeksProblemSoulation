/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static Node linkDelete(Node head, int n, int m) {
        // code here 
        Node pre = null;
        Node curr = head;
        
        // ignore 
        while(curr != null ){
             // igonre 
            for(int i=1; i<=m && curr!= null; i++){
                pre = curr;
                curr = curr.next;
                
            }
            // it is import 
            if(curr == null){
                return head;
            }
           
            // delete
            for(int i=1; i<=n&& curr !=null ; i++){
                curr = curr.next;
            }
            // after that link arrange 
            pre.next = curr;
         
        }
       return head;
    }
}