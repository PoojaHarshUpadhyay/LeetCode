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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        int ldia = diameterOfBinaryTree(root.left);
        int rdia = diameterOfBinaryTree(root.right);
        return Math.max(lheight+rheight, Math.max(ldia, rdia));
    }
    
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        if(l > r) {
            return l+1;
        } else {
            return r+1;
        }
    }
}

//https://www.youtube.com/watch?v=_O-mK2g_jhI
