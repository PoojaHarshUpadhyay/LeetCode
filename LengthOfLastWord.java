class Solution {
    public int lengthOfLastWord(String s) {
         if (s.equals("") || s == null) {
            return 0;
        }
        String[] ss = s.split(" ");
        if (ss.length <= 0) {
            return 0;
        }
        String lastElement = ss[ss.length - 1].trim();
        return lastElement.trim().length();
    }
}
