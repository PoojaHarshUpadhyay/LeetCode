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
    public TreeNode sortedArrayToBST(int[] nums) {
       if (nums == null || nums.length < 0) {
           return null;
       }
        return convertToTree(nums, 0, nums.length-1);
    }
    private TreeNode convertToTree(int[] nums, int left, int right) {
        if (left > right ) {
            return null;
        }
        int mid = (left+right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convertToTree(nums, left, mid-1);
        node.right = convertToTree(nums, mid+1, right);
        return node;
    }
}
