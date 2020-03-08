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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
       boolean flag = true;
        TreeNode dummy = root;
        while(flag) {
            if(val <= dummy.val) {
                // traverse left 
                if(dummy.left == null) {
                    //do insert
                    dummy.left = new TreeNode(val);
                    flag = false;
                } else {
                  dummy = dummy.left;
                }    
            } else {
                //traverse right
                if(dummy.right == null) {
                    //do insert
                    dummy.right = new TreeNode(val);
                    flag = false;
                } else {
                    dummy = dummy.right;
                }
            }
        }
        return root;
    }
}
