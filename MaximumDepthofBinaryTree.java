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
