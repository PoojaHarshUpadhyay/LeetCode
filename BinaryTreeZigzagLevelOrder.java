
    List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        //We push root to level 0 of the result list
        stack1.push(root);

        int level = 1;

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            //This is for odd level -> Right to Left
            if (level % 2 == 1) {
                //Check stack 1 if the value is present then pop that node and set it as current node and
                //explore that node -> if left node is available then push it in stack 2,
                // if right node is available push it in stack 2
                while (!stack1.isEmpty()) {
                    TreeNode currentNode = stack1.pop();
                    list.add(currentNode.data);
                    if (currentNode.left != null) {
                        stack2.push(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        stack2.push(currentNode.right);
                    }
                }

            }
            //This is for even level -> Left to Right
            if (level % 2 == 0) {
                //Check stack 2 if the value is present then pop that node and set it as current node and
                //explore that node -> if right node is available then push it in stack 1,
                // if left node is available push it in stack 1
                while (!stack2.isEmpty()) {
                    TreeNode currentNode = stack2.pop();
                    list.add(currentNode.data);
                    if (currentNode.right != null) {
                        stack1.push(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        stack1.push(currentNode.left);
                    }
                }
            }
            result.add(list);
            level++;
        }
        return result;
    }
