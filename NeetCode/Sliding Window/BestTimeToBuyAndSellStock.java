public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // Sliding Window
        // Time Complexity: O(N)
        // Space Complexity: O(1)
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
