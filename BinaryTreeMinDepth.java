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
    public int minDepth(TreeNode root) {
         int res = 0;

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            if (level != 0) {
                res++;
            }
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null) {
                    return res;
                }
                if (node.lQqeft != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            
        }

        return res;
    }
}
