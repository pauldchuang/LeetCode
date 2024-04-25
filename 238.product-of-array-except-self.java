/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1; 
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i-1] * ans[i-1];
            // System.out.println("a: " + i + ", " + ans[i]);
        }
        // for (int i = nums.length - 2; i >= 0; i--) {
        //     ans[i] = nums[i+1] * ans[i+1];
        // }
        // return ans;

        int[] ans2 = new int[nums.length];
        ans2[nums.length-1] = 1;
        for (int i = nums.length-2; i >=0 ; i--) {
            ans2[i] = nums[i+1] * ans2[i+1];            
            // System.out.println("b: " + i + ", " + ans2[i]);
        }        

        int[] ans3 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans3[i] = ans[i]*ans2[i];            
            // System.out.println("c: " + i + ", " + ans3[i]);
        }
        return ans3;
    }
}
// @lc code=end

