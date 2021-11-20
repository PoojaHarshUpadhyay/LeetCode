class Solution {
    
  public String longestPalindrome(String s) {
    int n = s.length();
      if(n < 0) {
          return "";
      }
      
      String result = s.substring(0, 1); //single caracter is palindrome
      
      for(int i = 0; i < n; i++) {
          //even
          String p1 = expandAroundCorner(s, i, i);
          if(p1.length() > result.length()) {
              result = p1;
          }
          
          //odd
          String p2 = expandAroundCorner(s, i, i+1);
          if(p2.length() > result.length()) {
              result = p2;
          }
      }
      return result;
  }
    
    private String expandAroundCorner(String s, int l, int r) {
        while((l >= 0 && r < s.length()) && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }



    
}
