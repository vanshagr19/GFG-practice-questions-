

class Solution {
    public void reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node fwd = null;
        while(curr != null){
            fwd =curr.next;
            curr.next = prev ;
            prev =curr;
            curr = fwd;
        }
        
    }
    Node reverseBetween(int a, int b, Node head) {
        // code here
        if (head == null || head.next == null) return head;
        Node dummy = new Node (-1);
        dummy.next =head;
        Node temp=dummy ;
        for(int i = 0 ;i <a-1 ;i++){
            temp=temp.next;
            
        }
        
        Node preva = temp;
        Node p = temp.next;
        
        for (int i = 0 ;i <= b-a ; i++){
            temp = temp.next;
        }
        
        Node currb = temp;
        Node q = temp.next;
        preva.next =null;
        currb.next = null;
        reverse(p);
        
        preva.next = currb;
        p.next = q;
        
        return dummy.next;
    }   
}