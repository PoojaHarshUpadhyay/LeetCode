class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int x) {
        val = x;
    }

    //Insert data in tree
    void insert(int data) {
        if (data <= val) {
            if (left == null) {
                left = new TreeNode(data);
            } else {
                left.insert(data);
            }
        } else {
            if (right == null) {
                right = new TreeNode(data);
            } else {
                right.insert(data);
            }
        }
    }

    // Pre order traversal
    void preOrderTraversal() {
        if (left != null) {
            left.preOrderTraversal();
        }
        System.out.println(val);
        if (right != null) {
            right.preOrderTraversal();
        }
    }
}
