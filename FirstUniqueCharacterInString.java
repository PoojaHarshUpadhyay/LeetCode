class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = -1;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                int count = map.get(c);
                count++;
                map.put(c, count);
            } else  {
                map.put(c, 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c) == 1) {
                res = i;
                break;
            }
        }
        
        return res;
    }
}
