import java.util.regex.Pattern;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        Pattern pat = Pattern.compile("^(.+)\\1+$");
        return pat.matcher(s).matches();
    }
}
