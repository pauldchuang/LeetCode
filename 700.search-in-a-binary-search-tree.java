/*
 * @lc app=leetcode id=700 lang=java
 *
 * [700] Search in a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> q = new LinkedList<>() {};
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t = q.remove();
            if (val == t.val) {
                return t;
            }
            if (val > t.val) {
                if (null != t.right) q.add(t.right);
            } else {
                if (null != t.left) q.add(t.left);
            }
        }
        return null;
    }
}
// @lc code=end

