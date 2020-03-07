class Solution {
    public String freqAlphabets(String s) {
        if(s.isEmpty()) {
            return "";
        }
        
       HashMap<String, Character> map = new HashMap<>();
      
        String sn = s.trim();
        
        int i = 1;
        for(char c = 'a'; c <= 'i'; c++) {
            map.put(Integer.toString(i), c);
            i++;
        }
        
        for(char c = 'j'; c <= 'z'; c++) {
            map.put(Integer.toString(i), c);
            i++;
        }
        StringBuilder result = new StringBuilder();
        for(int j = 0; j < sn.length(); j++ ) {
            StringBuilder sb = new StringBuilder();
            if( (j+2 < sn.length()) && (sn.charAt(j+2) == '#')) {
                sb.append(s.charAt(j));
                sb.append(s.charAt(j+1));
                j=j+2;
                char temp = map.get(sb.toString());
                result.append(temp);
            } else {
                char temp = map.get(Character.toString(sn.charAt(j)));
                result.append(temp);
            }
        }
        return result.toString();
    }
}
