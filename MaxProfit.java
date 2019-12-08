class Solution {
    public int maxProfit(int[] prices) {
            int profit = 0;
        if (prices.length > 0) {
            for (int i = 0; i < prices.length; i++) {
                for (int j = i; j < prices.length; j++) {
                    if (prices[i] < prices[j]) {
                        int temp = Math.abs(prices[i] - prices[j]);
                        if (profit < temp) {
                            profit = temp;
                        }
                    }
                }
            }
        } else {
            profit = 0;
        }
        return profit;
    }
}
