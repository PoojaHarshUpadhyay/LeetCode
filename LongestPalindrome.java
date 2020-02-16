class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0; 
        int start = 0; 
        if(s == null || s.length() <=0) {
            return "";
        }
        int n = s.length();
        boolean[][] matrix = new boolean[n][n];
        
        //fill i, i index of matrix
        for(int i = 0; i < n; i++) {
            matrix[i][i] = true;
            start = i; 
            maxLen = 1;
        }
        
        //fill i, i+1 index of matrix
        for(int i = 0; i < n-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                matrix[i][i+1] = true;
                start = i; 
                maxLen = 2;
            }
        }
        
        //fill remaining matrix
        for(int k = 3; k <= n; k++) {
            //iterate through k row 
            for(int i = 0; i < n-k+1; i++) {
                int j = k + i -1;
                //if palindrome
                if((s.charAt(i) == s.charAt(j))
                  && (matrix[i+1][j-1] == true)) {
                    matrix[i][j] = true;
                    if(k > maxLen) {
                        start = i;
                        maxLen = k;
                    }
                }
            }
        }
        
        return s.substring(start, maxLen+start);
        
    }
}
