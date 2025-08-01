/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class pallindromeLinkedList {
    public boolean isPalindrome(Node head) {
        // Your code here
        if(head == null || head.next == null) return true;
        
        //step-1 : finding the mid
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //Step-2 : reverse the second half
        Node secondHalf = reverse(slow);
        
        //Step-3: Compare both halves
        Node firstHalf = head;
        Node temp = secondHalf;
        
        while(temp != null) {
            if(firstHalf.data != temp.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }
        return true;
    }
    
    private Node reverse(Node head) {
        Node prev = null, curr = head;
        while(curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}