/*
 * @lc app=leetcode id=684 lang=java
 *
 * [684] Redundant Connection
 */

// @lc code=start
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        Map<Integer, Integer> rank = new HashMap<Integer, Integer>();
        for (int i = 1; i <= edges.length; i++) {
            m.put(i, -1);
            rank.put(i, 0);
        }
        for (int i = 0; i < edges.length; i++){
            boolean res = union(edges[i], m, rank);
            if (res) return edges[i];
        }
        return edges[0];
    }
    private int find(int x, Map<Integer, Integer> m) {
        if (m.get(x) == -1) {
            return x;
        }
        m.put(x, this.find(m.get(x), m));
        return m.get(x);
    }
    private boolean union(int[] edge, Map<Integer, Integer> m, Map<Integer, Integer> rank) {
        int x = edge[0]; int y = edge[1];
        int x_p = this.find(x, m); int y_p = this.find(y, m);
        if (x_p != y_p){
            if (rank.get(x_p) < rank.get(y_p)) {
                m.put(x_p, y_p);
                rank.put(y_p, rank.get(y_p) + 1);
            } else {
                m.put(y_p, x_p);
                rank.put(x_p, rank.get(x_p) + 1);
            }
            return false;
        }

        return true;
    }
}
// @lc code=end

