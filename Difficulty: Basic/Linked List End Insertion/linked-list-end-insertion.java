/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {

        Node newNode = new Node(x);

        // Empty linked list
        if (head == null) {
            return newNode;
        }

        // Find last node
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Insert new node at end
        temp.next = newNode;

        return head;
    }
}