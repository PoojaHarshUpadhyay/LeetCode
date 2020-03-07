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
    List<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) {
            return null;
        }
        inOrderTraversal(root);
        TreeNode cur;
        TreeNode node = new TreeNode(0);
        cur = node;
        for(int i = 0; i < list.size(); i++) {
            node.right = new TreeNode(list.get(i));
            node = node.right;
        }
        return cur.right;
    }
    
    private void inOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        list.add(root.val);
        inOrderTraversal(root.right);
    }
}

//https://leetcode.com/articles/increasing-order-search-tree/
