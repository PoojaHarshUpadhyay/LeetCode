class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> mappings = new HashMap<>();
        mappings.put('(', ')');
        mappings.put('{','}');
        mappings.put('[',']');
        
        Stack<Character> stack = new Stack<>();
        if(s.length() > 0) {
            char[] c = s.toCharArray();
            int i = 0;
            stack.push(c[i]);
            for (i = 1; i < c.length; i++) {
                //get the current character from string s
                char currentChar = c[i];
                
                //if opening bracket as key then add in stack
                if(!mappings.containsKey(currentChar)) {
                    
                    //get the latest value of stack
                    Character latestStack = stack.isEmpty() ? '#' : stack.pop();
                    
                    if(!mappings.containsKey(latestStack) ||                                            !mappings.get(latestStack).equals(currentChar)) {
                        stack.push(currentChar);
                    }
                    
                    
                } else {
                    stack.push(currentChar);
                }
                
            }
        }
        else {
            return true;
        }
       return stack.isEmpty(); 
    }
}
