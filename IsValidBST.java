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
      return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        boolean minVal = root.val > min;
        boolean maxVal = root.val < max;
        boolean leftNode = isBST(root.left, min, root.val);
        boolean rightNode = isBST(root.right, root.val, max);
        return minVal && maxVal && leftNode && rightNode;
      
    }
    
  
}
