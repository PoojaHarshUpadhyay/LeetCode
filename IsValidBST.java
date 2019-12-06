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
    public boolean isValidBST(TreeNode root) {
        if (!isBST(root, -1000, 1000)) {
            return false;
        } else {
            return true;
        }
    }
    
    private boolean isBST(TreeNode node, int min, int max) {
          if(node == null) {
                return true;
            }
            if (node.val <= min || node.val > max) {
                return false;
            }
            
            boolean leftTree = isBST(node.left, min, node.val);
            boolean rightTree = isBST(node.right, node.val, max);
            return leftTree && rightTree;    }
}
