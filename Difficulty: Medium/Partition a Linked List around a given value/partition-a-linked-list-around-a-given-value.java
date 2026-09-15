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
		Node d1 = new Node(-1);
		Node d2 = new Node(-1);
		Node d3 = new Node(-1);
		Node t1 = d1;
		Node t2 = d2;
		Node t3 = d3;
		Node i = head;
		while (i != null) {
			if (i.data < x) {
				t1.next = i;
				t1 = i;
			}
			else if (i.data == x) {
				t2.next = i;
				t2 = i;
			}
			else {
				t3.next = i;
				t3 = i;
			}
			i = i.next;
		}
		t3.next = null;
		if (d2.next == null) {
			t1.next = d3.next;
		}
		else {
			t1.next = d2.next ; }
			t2.next = d3.next;
			return d1.next;
		}
	};
