class Solution {
	
	public Node reverse(Node head) {
		Node prev = null;
		Node nxt = null;
		Node curr = head;
		while (curr != null) {
			nxt = curr.next ;
			curr.next = prev ;
			prev = curr;
			curr = nxt ;
			
		}
		return prev;
	}
	public Node addTwoLists(Node head1, Node head2) {
		
		Node dummy = new Node (-1);
		Node d = dummy;
		
		Node rh1 = reverse(head1);
		Node rh2 = reverse(head2);
		
		Node h1 = rh1;
		Node h2 = rh2;
		
		int sum = 0;
		int carry = 0;
		
		while (h1 != null || h2 != null || carry != 0) {
			sum = carry;
			if (h1 != null) {
				sum += h1.data;
				h1 = h1.next;
			}
			if (h2 != null) {
				sum += h2.data;
				h2 = h2.next;
			}
			
			int rem = sum % 10;
			if (sum>9)
				carry = 1 ;
			else
				carry = 0 ;
			
			Node newnode = new Node(rem);
			d.next = newnode ;
			d = newnode;
			
		}
		Node newhead = reverse(dummy.next);
		Node temp = newhead;
		while (temp.next != null) {
			if (temp.data == 0) {
				temp = temp.next;
			}
			else {
			    break; 
			    
			}
		}
		return temp;
		
	}
}
