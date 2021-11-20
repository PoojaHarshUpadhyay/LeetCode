/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
       if(root == null) {
           return 0;
       }
        int leftVal = maxDepth(root.left);
        int rightVal = maxDepth(root.right);
        return Math.max(leftVal, rightVal) +1;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
       if(root == null) {
           return 0; 
       }
        int l = calc(root);
       
        return l;
    }
    
    int calc(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        int output = 0; 

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            output++;
            
            for(int i = 0; i < queueSize; i++) {
                TreeNode n = queue.remove();
                if(n.left != null) {
                    queue.add(n.left);
                } 
                if (n.right != null) {
                    queue.add(n.right);
                }
            }
            
        }
        return output;
    }
}
