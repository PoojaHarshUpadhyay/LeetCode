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
        List<Integer> integerList = new ArrayList<>();
        insert(root, integerList);
        return integerList;
    }
    
    void insert(TreeNode root, List<Integer> integerList) {
        
        if (root == null) {
            return;
        }
        insert(root.left, integerList);
        integerList.add(root.val);
        insert(root.right, integerList);
        
        
    }
}
