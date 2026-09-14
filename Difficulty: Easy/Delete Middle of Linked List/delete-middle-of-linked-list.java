/* Node Structure
class Node {
	int data;
	Node next;
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	public Node deleteMid(Node head) {
	    if (head == null || head.next == null) {
			    return null;
			}
		// code here
		Node slow = head;
		Node fast = head ;
		Node prevslow = null ;
		while (fast != null && fast.next != null) {
		    prevslow =slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prevslow.next = slow.next;
		return head;
		
	}
}
