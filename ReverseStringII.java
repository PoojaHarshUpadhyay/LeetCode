class Solution {
    public void reverseWords(char[] s) {
        //do reverse
        reverse(s, 0, s.length-1);
        
        //reverse a word
        reverseWord(s);
    }
    
    private void reverse(char[] s , int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    
    private void reverseWord(char[] s) {
        int start = 0; 
        int end = 0; 
        while (start < s.length) {
            while(end < s.length && s[end] != ' '){
                ++end;
            }
            reverse(s, start, end-1);
            start = end+1; 
            end = start;
        }
    }
    
}
