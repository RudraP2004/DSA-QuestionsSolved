import java.util.Scanner;

public class StackUsingLL {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public StackUsingLL() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (!isEmpty()) {
            int value = head.data;
            head = head.next;
            System.out.println("Popped: " + value);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void display() {
        if (!isEmpty()) {
            Node current = head;
            System.out.print("Stack: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }

    public Node reversNode(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev to current
            current = next;      // Move to next node
        }
        return prev; // New head of the reversed list
    }

    public Node midFind(Node head) {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2
        }
        return slow; // Slow will be at the middle node
    }

    public Node findNthFromEnd(Node head, int n) {
        Node mainPtr = head;
        Node refPtr = head;

        int count = 0;
        if (head != null) {
            while (count < n) {
                if (refPtr == null) {
                    System.out.println(n + " is greater than the number of nodes in the list");
                    return null;
                }
                refPtr = refPtr.next;
                count++;
            }
            while (refPtr != null) {
                mainPtr = mainPtr.next;
                refPtr = refPtr.next;
            }
            return mainPtr; // mainPtr will be at the nth node from the end
        }
        return null;
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
