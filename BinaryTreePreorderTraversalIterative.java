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
    public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            int level = stack.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = stack.pop();
                result.add(node.val);
                if(node.right != null) {
                    stack.add(node.right);
                }
                if(node.left != null) {
                    stack.add(node.left);
                }
            }
        }
        return result;
    }
}
