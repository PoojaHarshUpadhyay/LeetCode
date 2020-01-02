class Solution {
    public String reverseVowels(String s) {
         List<Character> vovel = new ArrayList<>();
       addList(vovel);
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();
        while (start < end) {
            if (vovel.contains(chars[start]) && vovel.contains(chars[end])) {
                char temp = chars[end];
                chars[end] = chars[start];
                chars[start] = temp;
                end--;
                start++;
            }
            else if (!vovel.contains(chars[start])) {
                start++;
            } else {
                end--;
            }
        }
        return String.valueOf(chars);
    }
    void addList (List<Character> vovel) {
         vovel.add('a');
        vovel.add('e');
        vovel.add('i');
        vovel.add('o');
        vovel.add('u');
        vovel.add('A');
        vovel.add('E');
        vovel.add('I');
        vovel.add('O');
        vovel.add('U');
    }
}
