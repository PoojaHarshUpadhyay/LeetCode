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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean foundX = false;
        boolean foundY = false;
        //if queue is not empty
        while(!queue.isEmpty()) {
            int level = queue.size();
            foundX = false;
            foundY = false;
            for (int i = 0; i < level; i++) {
                TreeNode n = queue.poll();
                if(n.left != null && n.right != null) {
                if((n.left.val == x && n.right.val == y) || 
                   (n.left.val == y && n.right.val == x)) {
                    return false;
                }
                }
                if(n.val == x) {
                    foundX = true;
                }
                if(n.val == y) {
                    foundY = true;
                }
                if(n.left != null) {
                    queue.add(n.left);
                }
                if(n.right != null) {
                    queue.add(n.right);
                }
            }
            if(foundX == true && foundY == true) {
                return true;
            }
        }
        return foundX && foundY;
    }
}
