class preorderTraversal {
    public ArrayList<Integer> preorder(Node root) {
        //  code here
        ArrayList<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }
    
    private void preorderHelper(Node node, ArrayList<Integer> result) {
        if(node == null) return;
        
        result.add(node.data);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }
}