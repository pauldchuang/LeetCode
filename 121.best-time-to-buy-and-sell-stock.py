#
# @lc app=leetcode id=121 lang=python3
#
# [121] Best Time to Buy and Sell Stock
#

# @lc code=start
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        T_i10 = 0
        T_i11 = float('-inf')

        for price in prices:
            T_i10 = max(T_i10, T_i11 + price)
            T_i11 = max(T_i11, -price)
        
        return T_i10

        
# @lc code=end

