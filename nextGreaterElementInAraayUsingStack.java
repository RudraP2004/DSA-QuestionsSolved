import java.util.ArrayList;
class nextGreaterElementInAraayUsingStack {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        //start ieration from the right end 
        for(int i = n - 1; i >= 0; i--) {
            //remove element smaller than the current element
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
            //if stack us empty no greater element
            if(stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }
            
            stack.push(arr[i]);
        }
        Collections.reverse(result);
        return result;
    }
}