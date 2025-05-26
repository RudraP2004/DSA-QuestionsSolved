public class Stack {

    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            int value = stackArray[top--];
            System.out.println("Popped: " + value);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void display() {
        if (!isEmpty()) {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }

    public static void main(String[] args) {
        Stack stk = new Stack(5);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        //stk.pop(20);

        stk.display();
        stk.pop();
        stk.pop();
        stk.pop();

        stk.display();
    }
}
