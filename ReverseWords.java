import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] lstStr = str.split("\\s+");
        Collections.reverse(Arrays.asList(lstStr));
        String result =  String.join(" ", lstStr);
        System.out.println( result.trim());
        return result;
    }
}
