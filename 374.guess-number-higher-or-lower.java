/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1, h = n;
        int mid, res;
        while (l <= h) {
            mid = l + (h-l) / 2;
            res = guess(mid);        
            if (res == 1) {
                l = mid + 1;
            } else if (res == -1) {
                h = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
}
// @lc code=end
