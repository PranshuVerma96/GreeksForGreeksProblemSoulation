/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        // code here
        
        // Dummy Node 
        Node lesserHead = new Node(-1);
        Node lesserTail = lesserHead;
        
        // Dummy Node for equal to x
            Node equalHead = new Node(-1);
            Node equalTail = equalHead;
        
        Node greaterHead = new Node(-1);
        Node greaterTail = greaterHead;
        
        Node temp = head;
        
        if(temp == null){
            return head;
        }
        
        while(temp != null){
            if(temp.data < x){
                // save current node 
                Node nodeToInsert = temp;
                
                temp = temp.next;
                // separate node 
                nodeToInsert.next = null;
                
                // Insert into lesser list 
                lesserTail.next = nodeToInsert;
                lesserTail = nodeToInsert;
            }
            else if(temp.data == x){
                Node nodeToInsert = temp;
                
                // move to remaining list
                temp = temp.next;
                
                // separate current node 
                nodeToInsert.next = null;
                
                // Insert into equal list
                equalTail.next  = nodeToInsert;
                equalTail = nodeToInsert;
                
            }
            else{
                // save current node 
                Node nodeToInsert = temp;
                
                // move to reamaing list 
                temp = temp.next;
                
                nodeToInsert.next = null;
                
                
                // insert into greater list
                greaterTail.next = nodeToInsert;
                greaterTail = nodeToInsert;
                
            }
        }
        
        // Join both lists
        lesserTail.next = equalHead.next;
        
        equalTail.next = greaterHead.next;
        
        // remove dummy node 
        return lesserHead.next;
        
    }
};