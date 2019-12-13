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
    //Used BFS 
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        //Check root is null
        if(root == null) {
            return result;
        }
        
        // Created empty queue and will add node that we want to explore
        Queue<TreeNode> queue = new LinkedList<>();
        // Added root node
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            List<Integer> levelList = new ArrayList<>();
            
            //Here exploring the child nodes and adding the value in List then 
            //removing it from queue and adding another node to the queue that we 
            //want to explore further
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                list.add(node.data);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(levelList);    
            
        }
        
        return result;
    }
}
