/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        for (int fast = 0, slow = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0 && nums[slow] == 0) {
                this.swap(nums, fast, slow);
            }
            if (nums[slow] != 0) {
                slow += 1;
            }
        }
    }

    private void swap(int[] arr, int arg1, int arg2) {
        int tmp = arr[arg1];
        arr[arg1] = arr[arg2];
        arr[arg2] = tmp;
    }
}
// @lc code=end
