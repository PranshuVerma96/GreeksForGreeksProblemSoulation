/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> forward = new ArrayList<>();
        List<Integer> backward = new ArrayList<>();

        Node temp = head;

        // Traverse forward
        while (temp != null) {
            forward.add(temp.data);
            temp = temp.next;
        }

        // Traverse backward
        temp = head;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
        while (temp != null) {
            backward.add(temp.data);
            temp = temp.prev;
        }

        ans.add(forward);
        ans.add(backward);

        return ans;
    }
}
