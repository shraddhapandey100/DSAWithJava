/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    public boolean isDeadEnd(Node root) {
        // Code here.
        return solve(null, root, null);
    }
    
    public boolean solve(Node low, Node node, Node high) {
        if(node == null) {
            return false;
        }
        
        if(high != null && node.data == 1 && high.data == 2) {
            return true;
        }
        
        
        if(low != null && high != null && node.data - 1 == low.data && node.data + 1 == high.data) {
            return true;
        }
        
        return solve(low, node.left, node) || solve(node, node.right, high);
    }
}

