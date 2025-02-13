public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size = 1;

    public void addFirst(int data) { //O(1)
        //step 1 = create new node
        Node newNode = new Node(data);
        size++;
        //CHECKING 
        if(head == null) {
            head = tail = newNode;
            return;
        }
        //step 2 newnode next = head
        newNode.next = head;
        //step3 head= new node
        head = newNode;

    }
    public void addLast(int data) { //o(1)
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    
    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+ "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addFirst(9);
        ll.print();
        ll.addFirst(89);
        ll.print();
        
    }
}
