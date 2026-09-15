/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        Node d1 = new Node(-1);
        Node d2 =new Node (-1);
        Node t1 =d1;
        Node t2 = d2 ;
        Node i = head;
        while(i != null){
            if (i.data%2 == 0){
                t1.next =i;
                t1 =i;
            }
            else{
                t2.next = i;
                t2 =i;
            }
            i = i.next;
        }
        t1.next =d2.next ;
        t2.next =null;
        return d1.next;
    }
}