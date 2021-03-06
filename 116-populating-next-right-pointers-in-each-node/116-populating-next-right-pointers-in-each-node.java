/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList();
        if ( root!=null )
        queue.add(root);
        
        while ( !queue.isEmpty() ) {
            Node prev = null;
            Queue<Node> nextQueue = new LinkedList();
            
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if ( prev != null ) 
                    prev.next = node;
                prev = node;
                if ( node.left!=null)
                    nextQueue.add(node.left);
                if ( node.right!=null)
                    nextQueue.add(node.right);
            }
            
            queue = nextQueue;
        }
        
        return root;
    }
}