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
    int path = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        findSum(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return path;
    }
    
    private void findSum(TreeNode root, int sum) {
        if(root == null) {
            return;
        }
        if(root.val == sum) {
            path++;
        }
        findSum(root.left, sum - root.val);
        findSum(root.right, sum - root.val);
    }
}
