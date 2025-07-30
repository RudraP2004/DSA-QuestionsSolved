/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class  mergeTwoSortedLinkedList {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        
        //recursive merge
        if(head1.data <= head2.data) {
            head1.next = sortedMerge(head1.next, head2);
            return head1;
        } else {
            head2.next = sortedMerge(head1, head2.next);
            return head2;
        }
    }
}