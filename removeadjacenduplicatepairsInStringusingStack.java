import java.util.Stack;

class removeadjacenduplicatepairsInStringusingStack {
    public static String removePair(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); //remove the pair
            } else {
                stack.push(ch); //no pair, add the char
            }
        }
        
        //Build the result from the stack
        StringBuilder result = new StringBuilder();
        for(char ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
    }
}