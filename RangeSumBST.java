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
    int sum = 0; 
    public int rangeSumBST(TreeNode root, int L, int R) {
       dfs(root, L, R);
       return sum;
    }
    
    private void dfs(TreeNode node, int L, int R) {
        if(node == null) {
            return;
        }
        if(node.val <= R && node.val >= L) {
            sum += node.val;
        }
        if(node.left != null) {
            dfs(node.left, L, R);
        }
        if(node.right != null) {
            dfs(node.right, L, R);
        }
    }
}
