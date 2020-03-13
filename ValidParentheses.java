class Solution {
    public boolean isValid(String s) {
      if (s == "") {
          return true;
      }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if(!stack.isEmpty() && isValidParenthesis(stack.peek(), c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    
    private boolean isValidParenthesis(char left, char right) {
        boolean result = false;
        if(left == '(' && right == ')') {
            result = true;
        }
        if(left == '[' && right == ']') {
            result = true;
        }
        if(left == '{' && right == '}') {
            result = true;
        }
        return result;
    }
}
