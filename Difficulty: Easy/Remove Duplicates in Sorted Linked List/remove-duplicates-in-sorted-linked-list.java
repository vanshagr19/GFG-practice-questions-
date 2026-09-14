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
        Node a = head;
        Node b = head.next;
        if (head == null || head.next ==null) return head;
        while( b != null){
            if (a.data!= b.data){
                a.next = b;
                a = b;
            }
            b = b.next;
        }
        a.next =null;
        return head;
    }
}