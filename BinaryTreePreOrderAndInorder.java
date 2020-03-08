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
    int[] preorder;
    int[] inorder;
    int pre_index = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper (0, preorder.length);
    }
    private TreeNode helper(int start, int end) {
        if(start == end ) {
            return null;
        }
        
        int root = preorder[pre_index];
        int mid = map.get(root);
        TreeNode node = new TreeNode(root);
        pre_index++;
        
        node.left = helper(start, mid);
        node.right = helper(mid +1, end);
        
        return node;
        
    }
}

//refered solution
