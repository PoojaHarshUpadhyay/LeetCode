class Solution {
    HashMap<Character, char[]>  map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
                List<String> result = new ArrayList<>();

        if(digits == null ) {
            return result;
        }
        digits = digits.trim();
        if(digits.equals("") ) {
            return result;
        }
        
        
        StringBuilder sb = new StringBuilder();
        addAllInMap();
        helperCalculate(digits, map, sb, result);
        
        return result;
        
    }
    
    private void helperCalculate(String digits,HashMap<Character, char[]> map,StringBuilder     sb,List<String> result){
        
        if(sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }
        for(char c : map.get(digits.charAt(sb.length()))) {
            sb.append(c);
            helperCalculate(digits, map, sb, result);
            sb.deleteCharAt(sb.length() -1);
        }
        
    }
    
    
     private void addAllInMap() {
        map.put('0', new char[] {});
        map.put('1', new char[] {});
        char[] c = {'a', 'b', 'c'};
        map.put('2', c);
        char[] d = {'d', 'e', 'f'};
        map.put('3', d);
        char[] g = {'g', 'h', 'i'};
        map.put('4', g);
        char[] j = {'j', 'k', 'l'};
        map.put('5', j);
        char[] m = {'m', 'n', 'o'};
        map.put('6', m);
        char[] p = {'p', 'q', 'r', 's'};
        map.put('7', p);
        char[] t = {'t', 'u', 'v'};
        map.put('8', t);
        char[] w = {'w', 'x', 'y', 'z'};
        map.put('9', w);
    }
}

//https://www.youtube.com/watch?v=h6FmiyYDjmk
