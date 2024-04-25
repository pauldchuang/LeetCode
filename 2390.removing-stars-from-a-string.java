/*
 * @lc app=leetcode id=2390 lang=java
 *
 * [2390] Removing Stars From a String
 */

// @lc code=start
import java.util.Stack;
import java.util.Iterator;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stk.push(s.charAt(i));
            } else {
                stk.pop();
            }
        }
        StringBuffer sb = new StringBuffer();
        Iterator<Character> itr = stk.iterator();
        while (itr.hasNext()) {
            sb.append(itr.next().toString());
        }
        return sb.toString();
    }
}
// @lc code=end
