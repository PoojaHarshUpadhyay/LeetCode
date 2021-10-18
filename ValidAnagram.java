import java.util.Hashtable;
import java.util.Map;
import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() == 0 || t.length() == 0) {
           return false;
       }
       if(s == t) {
           return true;
       }
        
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        
        for(int i= 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(m1.containsKey(c)) {
                int count = m1.get(c);
                count++;
                m1.put(c, count);
            } else {
                m1.put(c, 1);
            }
        }
        
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(m2.containsKey(c)) {
                int count = m2.get(c);
                count++;
                m2.put(c, count);
            } else {
                m2.put(c, 1);
            }
        }
        
        if(m1.equals(m2)) {
            return true;
        } else {
            return false;
        }
        
        
    }
}
