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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) {
            return false;
        }
        List<Integer> l1 = new ArrayList<>();
        isLeaf(root1, l1);
        List<Integer> l2 = new ArrayList<>();
        isLeaf(root2, l2);
        return l1.equals(l2);
    }
    
    public void isLeaf(TreeNode node, List<Integer> list) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null){
            list.add(node.val);
        }
        isLeaf(node.left, list);
        isLeaf(node.right, list);
    }
}
