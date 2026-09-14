/* Structure of linked list Node
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

    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public Node addOne(Node head) {

        // Step 1: Reverse original list
        head = reverseList(head);

        Node curr = head;
        int carry = 1;

        // Step 2: Add 1
        while (curr != null) {

            int nodeValue = curr.data;
            int sum = nodeValue + carry;

            int digit = sum % 10;
            curr.data = digit;

            carry = sum / 10;

            // If carry remains after last node
            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
            }

            curr = curr.next;
        }

        // Step 3: Reverse again
        head = reverseList(head);

        return head;
    }
}