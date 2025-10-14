/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int nodeSum(Node root, int l, int r) {
        // code here
           if (root == null) {
            return 0;
        }
        
        int sum = 0;
        
        if (root.data >= l && root.data <= r) {
            sum += root.data;
        }
        
        // both blocks will hit when l < root.data < r,
        // otherwise only one with valid candidates will hit.
        // This is an example of pruning.
        // left subtree might have valid nodes only when current node's value is 
        // greater than the l
        if (root.data > l) {
            sum += nodeSum(root.left, l, r);    
        }
        
        // right subtree might have valid nodes only when current node's value is 
        // less than the r
        if (root.data < r) {
            sum += nodeSum(root.right, l, r);   
        }
        
        return sum;
    }
}
