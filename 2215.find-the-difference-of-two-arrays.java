/*
 * @lc app=leetcode id=2215 lang=java
 *
 * [2215] Find the Difference of Two Arrays
 */

// @lc code=start
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();        
        for (int num : nums1) {
            s1.add(num);
        }
        for (int num : nums2) {
            s2.add(num);
        }
        
        for (int num : s1) {
            if (!s2.contains(num)) {
                l1.add(num);
            }
        }
        for (int num : s2) {
            if (!s1.contains(num)) {
                l2.add(num);
            }
        }
        return Arrays.asList(l1, l2);        
    }
}
// @lc code=end
