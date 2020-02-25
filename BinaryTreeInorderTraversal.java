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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        insert(root, list);
        return list;
    }
   private void insert(TreeNode root, List<Integer> list) {
       if(root == null) {
           return;
       }
       insert(root.left, list);
       list.add(root.val);
       insert(root.right, list);
   }
}
