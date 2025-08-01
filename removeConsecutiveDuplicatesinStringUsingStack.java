import java.util.Stack;

class removeConsecutiveDuplicatesinStringUsingStack {
    // Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String s) {
        // Your code here
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(stack.isEmpty() || stack.peek() != ch) {
                stack.push(ch);
            }
        }
        //Construct the result from the stack
        StringBuilder result = new StringBuilder();
        for(char ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
    }
}