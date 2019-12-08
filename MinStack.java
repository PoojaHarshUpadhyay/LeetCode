class MinStack {
    List<Integer> stackList;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stackList = new ArrayList<>();
    }

    public void push(int x) {
        if (x == (int) x) {
            stackList.add(x);
        } else {
            stackList.add(null);
        }
    }

    public void pop() {
        if (stackList.size() > 0) {
            stackList.remove(stackList.size() - 1);
        }
    }

    public int top() {
        int res = 0;
        if (stackList.size() > 0) {
            res = stackList.get(stackList.size() - 1);
        }
        System.out.println(res);
        return res;
    }

    public int getMin() {
        int result = 0;
        if (stackList.size() > 0) {
            result = stackList.get(0);
            for (int i = 1; i < stackList.size(); i++) {
                int temp = stackList.get(i);
                if (temp < result) {
                    result = temp;
                }
            }
            System.out.println(result);
        }
        return result;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
