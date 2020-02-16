class Solution {
    public boolean isPalindrome(String s) {
  boolean res = true;

    if (s.length() > 0) {
      s = s.replaceAll("[^a-zA-Z0-9\\s]", "")
          .replaceAll("\\s", "")
          .toLowerCase();

      int start = 0;
      int end = s.length() - 1;
      for (int i = 0; i < s.length(); i++) {
          char a = s.charAt(start);
          char b = s.charAt(end);
          if (start <= end) {
            if (a == b) {
              res = true;
            } else {
              res = false;
                break;
            }
            start++;
            end--;
          }
      }
    }

    return res;
    }
}
