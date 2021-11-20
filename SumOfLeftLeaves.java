/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        cal(root);
        return res;
    }
    
    void cal(TreeNode node) {
        if(node == null) {
            return;
        }
        if(node != null && node.left != null 
           && node.left.left == null && node.left.right == null) {
            res += node.left.val;
        }
        cal(node.left);
        cal(node.right);
    }
    
  
}
