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
    public  boolean isUnivalTree(TreeNode root) {
        if(root == null) {
            return false;
        }
        int rootVal = root.val;
        boolean result = evaluate(root, rootVal);
        return result;
    }

    boolean evaluate(TreeNode root, int val) {
      return (root == null) || (root.val == val && evaluate(root.left, val) && evaluate(root.right, val) );
    }
}
