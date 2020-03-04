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
    HashSet<Integer> set = new HashSet<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        int diff = k - root.val;
        if(set.contains(diff)) {
            return true;
        }
        set.add(root.val);
        boolean left1 = findTarget(root.left , k);
        boolean left2 =  findTarget(root.right , k);
        return left1 || left2;
    }
}
