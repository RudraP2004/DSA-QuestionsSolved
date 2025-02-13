public class LinkedLists {

    public static Node head;
    public static Node tail;

    public int size = 1;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding an element at the beginning of the LinkedList
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Adding an element at the end of the LinkedList
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // Corrected mistake
        tail = newNode; // Move tail to the new node
    }

    // Printing a LinkedList
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Iterative Search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive Search Helper
    public int helper(LinkedLists.Node head, int key) { // Fixed type
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    // Public method for recursive search
    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    // Reversing linkedlist
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromLast(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // removeFirst
            return;
        }

        // reach upto size-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is mid
    }

    public boolean checkPallindrome() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }

        // step-1 Finding mid
        Node midNode = findMid(head);

        // step-2 Reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right part head
        Node left = head;

        // step-3 If Check left == right part
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        //ll.addFirst(8);

        ll.print();

        // System.out.println(ll.itrSearch(3)); // Expected output: 2
        // System.out.println(ll.itrSearch(10)); // Expected output: -1

        // System.out.println(ll.recursiveSearch(3)); // Expected output: 2
        // System.out.println(ll.recursiveSearch(10)); // Expected output: -1

        // ll.reverse();
        // ll.print();

        //ll.deleteNthfromLast(3);
        //ll.print();

        System.out.println(ll.checkPallindrome());
        //ll.print();
    }
}
