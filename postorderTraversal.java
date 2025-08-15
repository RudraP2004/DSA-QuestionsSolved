/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }
    
    private void postorderHelper(Node node, ArrayList<Integer> result) {
        if(node == null) return;
        
        postorderHelper(node.left, result);
        postorderHelper(node.right, result);
        result.add(node.data);
    }
}