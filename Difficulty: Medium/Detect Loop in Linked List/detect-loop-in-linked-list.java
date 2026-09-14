/* Linked List Node Structure
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
    public boolean detectLoop(Node head) {
        // code here
        Node slow =head;
        Node fast = head.next;
        while(fast != null && fast.next !=null){
            if (fast ==slow) return true;
            fast = fast.next.next;
            slow =slow.next;
        }
        return false;
    }
}