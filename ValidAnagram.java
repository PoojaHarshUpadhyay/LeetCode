class Solution {
    public boolean isAnagram(String s, String t) {
          if ((s == "") && ( t == "")) {
            return true;
        }
        if (( s == "") || ( t == "")) {
            return false;
        }
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        HashMap<Character, Integer> hashMapOne = new HashMap<>();
        for (int i = 0; i < sarr.length; i++) {
            int count = 1;
            if (!hashMapOne.containsKey(sarr[i])) {
                hashMapOne.put(sarr[i], count);
            } else {
                int alreadyCount = hashMapOne.get(sarr[i]);
                alreadyCount++;
                hashMapOne.replace(sarr[i], alreadyCount);
            }
        }
        HashMap<Character, Integer> hashMapTwo = new HashMap<>();
        for (int i = 0; i < tarr.length; i++) {
            int count_two = 1;
            if (!hashMapTwo.containsKey(tarr[i])) {
                hashMapTwo.put(tarr[i], count_two);
            } else {
                int alreadyCount = hashMapTwo.get(tarr[i]);
                alreadyCount++;
                hashMapTwo.replace(tarr[i], alreadyCount);
            }
        }
        if (hashMapOne.equals(hashMapTwo)) {
            return true;
        } else {
            return false;
        }
    }
}
