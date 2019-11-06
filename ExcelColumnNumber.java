class Solution {
    public int titleToNumber(String s) {
       int num = 0; 
        int BASE = 26;
        for(int i = 0; i < s.length(); i++) {
            int calc = s.charAt(i) - 'A' +1; 
            num = num*BASE + calc;
        }
        return num;
    }
}
