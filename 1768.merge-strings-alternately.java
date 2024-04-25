/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
import java.lang.Math;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m_len = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < m_len; i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (word1.length() > m_len) {
            sb.append(word1.substring(m_len, word1.length()));
        }
        if (word2.length() > m_len) {
            sb.append(word2.substring(m_len, word2.length()));
        }
        return sb.toString();
    }
}
// @lc code=end

