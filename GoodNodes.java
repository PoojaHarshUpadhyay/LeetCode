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
    public int goodNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int max = dfs (root, root.val);
        
        return max;
    }
    
    private int dfs(TreeNode node, int val) {
        if(node == null) {
            return 0;
        }
        int max = Math.max(node.val, val);
      if(node.val >= val) {
        return 1 + dfs(node.left, max) + dfs(node.right, max);
      } else {
        return dfs(node.left, max) + dfs(node.right, max);
      }
    }
}
