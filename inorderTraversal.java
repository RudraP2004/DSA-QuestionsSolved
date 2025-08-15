/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class inorderTraversal {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }
    
    private void inorderHelper(Node node, ArrayList<Integer> result) {
        if(node == null) return;
        
        inorderHelper(node.left, result);
        result.add(node.data);
        inorderHelper(node.right, result);
    }
}