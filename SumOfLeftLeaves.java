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
        calculate(root);
        return res;
    }
    
    private void calculate(TreeNode node) {
       
        if(node == null) {
            return;
        }
       
        //if leaf
        if(node.left != null && node.left.left == null 
           && node.left.right == null) {
            res += node.left.val;
        }
        
        calculate(node.left);
        calculate(node.right);
        
    }
}
