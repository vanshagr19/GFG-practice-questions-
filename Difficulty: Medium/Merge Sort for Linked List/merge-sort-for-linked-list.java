/* Structure of a Linked List node
class Node {
	int data;
	Node next;
	Node(int key) {
		data = key;
		next = null;
	}
} */

class Solution {
	
	Node sortedMerge(Node head1, Node head2) {
		// code here
		Node i = head1;
		Node j = head2;
		Node dummy = new Node(-1);
		Node k = dummy ;
		while (i != null && j != null) {
			if (i.data <= j.data) {
				k.next = i ;
				k = i;
				i = i.next;
			}
			else {
				k.next = j;
				k = j;
				j = j.next;
			}
			if (i == null)
				k.next = j;
			else
				k.next = i;
		}
		return dummy.next;
	}
	
	public Node mergeSort(Node head) {
	    if (head == null || head.next ==null) return head;
		// code here
		Node slow = head ;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node h2 = slow.next;
		slow.next = null;
		 head =mergeSort(head);
		 h2 = mergeSort(h2);
		return sortedMerge(head,h2);
		
		
	}
}
