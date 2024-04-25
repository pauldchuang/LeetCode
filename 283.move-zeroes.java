/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int f = 0, s = 0, tmp;       
        while (f < nums.length) {
            while (f < nums.length && nums[f] == 0) {
                f += 1;
            }
            while ( s < f && nums[s] != 0 ){
                s += 1;                
            }

            if (f == s) {
                f += 1;
            } else {
                if (f < nums.length) {
                    tmp = nums[f];
                    nums[f] = nums[s];
                    nums[s] = tmp;     
                    f += 1;
                    s += 1;
                }
            }       
        }
    }
}
// @lc code=end

