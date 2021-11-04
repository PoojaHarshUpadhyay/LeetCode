class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result,"", 0, 0, n);
        return result;
    }
    
    private void backTrack(List<String> output, String curr, int open, int close, int max) {
        
        //base condition
        if(curr.length() == max *2) {
            output.add(curr);
            return;
        }
        
        if(open < max) {
           backTrack(output, curr+"(", open+1, close, max); 
        }
        
        if(close < open) {
            backTrack(output, curr+")", open, close+1, max);
        }
    }
}
