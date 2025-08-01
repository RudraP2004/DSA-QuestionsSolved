
/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class mergeKsortedLinkedList{
   //function to merge two sorted linkedlist lists
   Node mergeTwoLists(Node l1, Node l2) {
       Node dummy = new Node(0);
       Node tail = dummy;
       
       while(l1 != null && l2 != null) {
           if(l1.data < l2.data) {
               tail.next = l1;
               l1 = l1.next;
           } else {
               tail.next = l2;
               l2 = l2.next;
           }
           tail = tail.next;
       }
       
       if(l1 != null) tail.next = l1;
       if(l2 != null) tail.next = l2;
       
       return dummy.next;
   }
   
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        if(arr == null || arr.size() == 0) return null;
        
        int last = arr.size() - 1;
        while(last != 0) {
            int i = 0, j = last;
            
            while(i < j) {
                arr.set(i, mergeTwoLists(arr.get(i), arr.get(j)));
                i++;
                j--;
                
                if(i >= j) {
                    last = j;
                }
            }
        }
        return arr.get(0);
    }
}