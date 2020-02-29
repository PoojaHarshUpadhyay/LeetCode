class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 0) {
            return 0; 
        }
        map.put(1, 1);
        map.put(2,2);
        int result = calc(n);
        return result;
    }
    private int calc(int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n < 3) {
            return map.get(n);
        }
        int res = calc(n-1) + calc(n-2);
        map.put(n, res);
        return res;
    }
}
