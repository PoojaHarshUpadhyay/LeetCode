class Solution {
    public int fib(int N) {
        if(N == 0) {
            return 0;
        }
        int result = fibo(N);
        return result;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    private int fibo(int N) {
        if(map.containsKey(N)){
            return map.get(N);
        }
        if(N < 3){
            return 1;
        }
        int res = fibo(N-1) + fibo(N-2);
        map.put(N, res);
        return res;
    }
}
