package Graphs;

import java.util.*;

/*
  LeetCode Ques 785. Is Graph Bipartite?
There is an undirected graph with n nodes, where each node is numbered between 0 and n - 1. You are given a 2D array graph, 
where graph[u] is an array of nodes that node u is adjacent to. More formally, for each v in graph[u], there is an undirected 
edge between node u and node v. 
The graph has the following properties:
There are no self-edges (graph[u] does not contain u).
There are no parallel edges (graph[u] does not contain duplicate values).
If v is in graph[u], then u is in graph[v] (the graph is undirected).
The graph may not be connected, meaning there may be two nodes u and v such that there is no path between them.

A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph 
connects a node in set A and a node in set B.

Return true if and only if it is bipartite.
 */

public class IsGraphBipartite {
    class Pair{
        int vtx; // vertex
        int dist; // distance
        public Pair(int vtx , int dist){
            this.vtx = vtx;
            this.dist = dist;
        }
    }
    class Solution {
        public boolean isBipartite(int[][] graph) {
            Queue<Pair> q = new LinkedList<>();
            HashMap<Integer , Integer> visited = new HashMap<>();
            // jitni graph.length ki value utne hi vertices in graph
            // because graph ka har index ek node/vertex represent krra
            for (int key = 0 ; key < graph.length ; key++) {
                if (visited.containsKey(key)) {
                    continue;
                }
                q.add(new Pair(key , 0));
                while (!q.isEmpty()) {
                    // 1. Remove
                    Pair rp = q.poll(); // Removed Pair(rp)
                    // 2. Ignore if already visited
                    if (visited.containsKey(rp.vtx)) {
                        if (visited.get(rp.vtx) != rp.dist) {
                            return false;
                        }
                        continue;
                    }
                    // 3. Mark Visited
                    visited.put(rp.vtx , rp.dist);
                    // 4. Self Work(Nothing here)
                    // 5. Add unvisited nbrs
                    for (int nbrs : graph[rp.vtx]) {
                        if (!visited.containsKey(nbrs)) {
                            q.add(new Pair(nbrs , rp.dist + 1));
                        }
                    }
                }
            }
            return true;
        }
    }
}




