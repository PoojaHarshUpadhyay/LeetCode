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
     public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
       boolean res = isMirror(root.left, root.right);
        return res;
    }
    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val){
            return false;
        }
       if(!isMirror(left.right, right.left)) {
            return false;
        }
        if(!isMirror(left.left, right.right)) {
            return false;
        }
        return true;
    }
}
