class Solution {
    public static int findMiddle(Node head) {
        Node first = head;
        Node second = head;

        while (first.next != head) {
            first = first.next;

            if (first.next != head) {
                first = first.next;
                second = second.next;
            }
        }

        return second.data;
    }
}