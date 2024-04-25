/*
 * @lc app=leetcode id=790 lang=java
 *
 * [790] Domino and Tromino Tiling
 */

// @lc code=start
import java.util.HashMap;

class Solution {
    public int numTilings(int n) {
        long prev = 0;
        long mod = 1000000007L;
        HashMap<Integer, Long> dp = new HashMap<>();
        dp.put(0, 1L);
        dp.put(1, 1L);
        dp.put(2, 2L);
        long val;
        for (int i = 3; i <= n; i++) {
            prev = prev % mod + dp.get(i - 3) % mod;
            val = dp.get(i - 1) % mod + dp.get(i - 2) % mod + (prev % mod) * 2;
            val %= mod;
            dp.put(i, val);
        }
        long ans = dp.get(n);
        return (int)ans;
    }
}
// @lc code=end
