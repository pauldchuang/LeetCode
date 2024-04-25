/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int md = 0;
        Queue<TreeNode> qt = new LinkedList<>();        
        qt.add(root);        
        while (!qt.isEmpty()) {
            md += 1;
            int queueSize = qt.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode t = qt.remove();                
                if (t.left != null) {
                    qt.add(t.left);                    
                }
                if (t.right != null) {
                    qt.add(t.right);                    
                }
            }            
        }
        return md;
    }
}
// @lc code=end
