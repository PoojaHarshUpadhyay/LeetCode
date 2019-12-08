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

    // In order traversal
    void inOrderTraversal() {
        if (left != null) {
            left.inOrderTraversal();
        }
        System.out.println(val);
        if (right != null) {
            right.preOrderTraversal();
        }
    }

    //Post order traversal
    void postOrderTraversal() {
        if (left != null) {
            left.postOrderTraversal();
        }
        if (right != null) {
            right.postOrderTraversal();
        }
        System.out.println(val);
    }

    //Pre order Traversal
    void preOrderTraversal() {
        System.out.println(val);
        if (left != null) {
            left.preOrderTraversal();
        }
        if (right != null) {
            right.preOrderTraversal();
        }
    }
}
