class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length <= 0) {
            return new ArrayList();
        }
        HashMap<String, List> map = new HashMap();
        
        for(int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(strs[i]);
        }
        
        return new ArrayList(map.values());
        
        
    }
        
}
