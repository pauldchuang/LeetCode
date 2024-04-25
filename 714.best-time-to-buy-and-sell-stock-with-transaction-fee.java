/*
 * @lc app=leetcode id=714 lang=java
 *
 * [714] Best Time to Buy and Sell Stock with Transaction Fee
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length; int buy[] = new int[len]; int sell[] = new int [len];
        buy[0] = -prices[0]; sell[0] = 0;
        for (int i = 1; i < len; i++) {
            buy[i] = Math.max(buy[i-1], -prices[i] + sell[i-1]);
            sell[i] = Math.max(sell[i-1], prices[i] + buy[i-1] - fee);
        }
        return sell[len-1];        
    }
}
// @lc code=end