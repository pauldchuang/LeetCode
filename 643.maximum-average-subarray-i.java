/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        int index = k;
        while (index < nums.length) {
            sum += nums[index];
            sum -= nums[index - k];
            if (sum > max)
                max = sum;
            index += 1;
        }

        return (double) max / k;
    }
}
// @lc code=end
