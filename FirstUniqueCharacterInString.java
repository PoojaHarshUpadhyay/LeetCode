class Solution {
    public int firstUniqChar(String s) {
          for(int i = 0; i < s.length(); i++) {
            int lastIndex = s.lastIndexOf(s.charAt(i));
            int currentIndex = s.indexOf(s.charAt(i));
            if(lastIndex == currentIndex){
                return i;
            }
        }
        return -1;
    }
}
