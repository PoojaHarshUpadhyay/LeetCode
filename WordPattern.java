class Solution {
    public boolean wordPattern(String pattern, String str) {
       char[] chars = pattern.toCharArray();
        String[] strings = str.split(" ");
        if (chars.length != strings.length) {
            return false;
        }
        boolean result = false;
        HashMap<Character, String> hashMap = new HashMap();
        for (int i = 0; i < chars.length; i++) {
            if (!hashMap.containsKey(chars[i]) && !hashMap.containsValue(strings[i])) {
                hashMap.put(chars[i], strings[i]);
                result = true;
            } else {
                if (hashMap.containsKey(chars[i])) {
                    if (hashMap.get(chars[i]).equals(strings[i])) {
                        result = true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return result;
    }
}
