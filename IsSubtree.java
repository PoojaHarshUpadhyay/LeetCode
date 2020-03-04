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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null) {
            return true;
        }
        if(s == null || t == null) {
            return false;
        }
        if(isEqual(s, t)){
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    
    boolean isEqual(TreeNode s, TreeNode t) {
       if(s == null && t == null) {
           return true;
       }
        if(s == null || t == null) {
            return false;
        }
        if(s.val == t.val) {
            boolean left =  isEqual(s.left, t.left);
            boolean right = isEqual(s.right, t.right);
            return left && right;
        }
        return false;
    }

    
    
}
