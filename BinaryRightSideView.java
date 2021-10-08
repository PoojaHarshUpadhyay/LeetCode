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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        } 
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int level = queue.size();
            for(int i = 0; i < level; i++) {
            TreeNode node = queue.poll();
                if (i == level-1) {
                    list.add(node.val);
                }
                if(node.left != null) {
                    queue.add(node.left);
                } 
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return list;
    }
}
