class Solution {
    public int strStr(String haystack, String needle) {
           int res = -1;

	 if(haystack.length() < 0){
         return -1;
     }
	 if(haystack.length() ==1 ||  haystack.equals(needle)) {
		 return 0;
	 }
	 if(needle.length() >0 &&  haystack.contains(needle)) {
		char n = needle.charAt(0);
		for(int i = 0; i < haystack.length(); i++) {
			String newWord = haystack.substring(i, haystack.length());
			if(newWord.startsWith(needle)){
				res = i;
				break;
			}
		}
	 }
	 return res;     
    }
}
