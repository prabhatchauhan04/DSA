package Graphs;
import java.util.*;
/*
 LeetCode Question 261. Graph Valid Tree
 Given n nodes labeled from 0 to n-1 and a list of undirected 
 edges (each edge is a pair of nodes), write a function to check whether these edges make up a valid tree.

Example 1:

Input: n = 5, and edges = [[0,1], [0,2], [0,3], [1,4]]
Output: true
Example 2:

Input: n = 5, and edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
Output: false
Note: you can assume that no duplicate edges will appear in edges. Since all edges are 
undirected, [0,1] is the same as [1,0] and thus will not appear together in edges.
 */

public class GraphValidTree {
	public boolean validTree(int n, int[][] edges) {
        // ye bnadiya apne type ka graph input se
        HashMap<Integer , List<Integer>> map = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        // Checking for valid tree
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        // Number of Components in Graph
        int components = 0;
        // DFT
        for (int key : map.keySet()) {
            if (visited.contains(key)) {
                continue;
            }
            components++;
            st.push(key);
            // DFS
            while (st.isEmpty() == false) {
                int rv = st.pop();
                if (visited.contains(rv)) {
                    // cycle detect krega ye block
                    return false;
                }
                visited.add(rv);
                for (int nbrs : map.get(rv)) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }
            }
        }
        // true return krdega agar components sirf ek hi hai graph mein
        return components==1;
    }
}




