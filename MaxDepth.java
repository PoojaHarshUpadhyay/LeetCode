class Solution {
    public int maxDepth(String s) {
        int max = 0; 
        Stack<Character> stack = new Stack<>();
        int count = 0; 
        
        for(int i =0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(c);
                count++;
            } else if (c == ')') {
                stack.pop();
                count--;
            }
            max = Math.max(max, count);
        }
        
        if(stack.size() == 0) {
            return max;
        } else {
            return 0;
        }
    }
}
