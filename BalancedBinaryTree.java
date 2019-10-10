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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getHeight(root) != -1;
    }
    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftVal = getHeight(node.left);
        int rightVal = getHeight(node.right);

        if (leftVal == -1 || rightVal == -1 || Math.abs(leftVal - rightVal) > 1) {
            return -1;
        }
        return Math.max(leftVal, rightVal) + 1;
    }
}
