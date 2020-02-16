class Solution {
    public int myAtoi(String str) {
double res = 0;
    String s = str.trim();
    String aa = "0123456789";
    int sign = 1;
    if (s.length() > 0) {
      int i = 0;
      if (s.charAt(0) == '-') {
        sign = -1;
        i++;
        }
      if (s.charAt(0) == '+') {
        sign = 1;
        i++;
        }
      for (int j = i; j < s.length(); j++) {
          if(s.charAt(j) >= '0' && s.charAt(j) <= '9') {

          int calc = s.charAt(j) - '0';
          res = res * 10 + calc;
        } else {
          break;
        }
      }
      if (res > Integer.MAX_VALUE) {
        if (sign == -1) {
          return Integer.MIN_VALUE;
        } else {
          return Integer.MAX_VALUE;
        }
      }
      res = sign * res;
    }


    return (int) res;
    }
}
