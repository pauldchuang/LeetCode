/*
 * @lc app=leetcode id=684 lang=java
 *
 * [684] Redundant Connection
 */

// @lc code=start
class Solution {
    public int[] findRedundantConnection(int[][] edges) {        
        int[] m = new int[edges.length];    
        int[] rank = new int[edges.length];
        for (int i = 0; i < edges.length; i++) {            
            m[i] = -1;            
        }
        for (int i = 0; i < edges.length; i++){
            boolean res = union(edges[i], m, rank);
            if (res) return edges[i];
        }
        return edges[0];
    }
    private int find(int x, int[] m) {
        if (m[x] == -1) {
            return x;
        }
        m[x] = this.find(m[x], m);
        return m[x];
    }
    private boolean union(int[] edge, int[] m, int[] rank) {
        int x = edge[0]-1; int y = edge[1]-1;
        int x_p = this.find(x, m); int y_p = this.find(y, m);
        if (x_p != y_p){
            if (rank[x_p] < rank[y_p]) {
                m[x_p] = y_p;
                rank[y_p] = rank[y_p] + 1;
            } else {
                m[y_p] = x_p;
                rank[x_p] = rank[x_p] + 1;
            }
            return false;
        }

        return true;
    }
}
// @lc code=end

