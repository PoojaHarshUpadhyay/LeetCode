class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         if(ransomNote.length() <= 0 && magazine.length() <= 0) {
            return true;
        }
        if(ransomNote.length() <= 0  && magazine.length() >= 0) {
            return true;
        }
       boolean res = false;
        HashMap<Character, Integer> hmRansomNote = new HashMap<>();
        HashMap<Character, Integer> hmMagazine = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if (hmRansomNote.containsKey(ransomNote.charAt(i))) {
                int val = hmRansomNote.get(ransomNote.charAt(i));
                hmRansomNote.put(ransomNote.charAt(i), ++val);
            } else {
                hmRansomNote.put(ransomNote.charAt(i), 1);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (hmMagazine.containsKey(magazine.charAt(i))) {
                int val = hmMagazine.get(magazine.charAt(i));
                hmMagazine.put(magazine.charAt(i), ++val);
            } else {
                hmMagazine.put(magazine.charAt(i), 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (hmMagazine.containsKey(ransomNote.charAt(i)) &&
                    hmRansomNote.containsKey(ransomNote.charAt(i))) {
               int val1 = hmMagazine.get(ransomNote.charAt(i));
                int val2 = hmRansomNote.get(ransomNote.charAt(i));
                 if(val1 >= val2) {
                    res = true;
                }else {
                    res = false;
                    break;
                }
            } else {
                res = false;
                break;
            }
        }

        return res;
    }
}
