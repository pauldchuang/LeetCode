/*
 * @lc app=leetcode id=1456 lang=java
 *
 * [1456] Maximum Number of Vowels in a Substring of Given Length
 */

// @lc code=start
class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int v = 0;
        for(int i = 0; i < k; i++) {
            if("aeiou".indexOf(s.charAt(i)) != -1){
                v += 1;
            }
            ans = v;
        }
        for (int i = k; i < s.length(); i++) {
            if("aeiou".indexOf(s.charAt(i)) != -1){
                v += 1;
            }            
            if("aeiou".indexOf(s.charAt(i-k)) != -1){
                v -= 1;
            }       
            if (v > ans) ans = v;
        }
        return ans;        
    }
}
// @lc code=end

