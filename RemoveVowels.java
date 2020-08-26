class Solution {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if(!isVovel(S.charAt(i))) {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean isVovel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
