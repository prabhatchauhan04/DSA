package Graphs;

import java.util.*;

// Kahns Algorithm
public class TopologicalSortBFS {
    private HashMap<Integer, List<Integer>> map;

    public TopologicalSortBFS(int v) {
        map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    // Directed Graph
    public void addEdge(int v1, int v2) {
        map.get(v1).add(v2);
    }

    // Topological Sort using BFS
    public void calcIndeg(int[] indeg) {
        // This function calculates indegree of every vertex of graph
        for (int node : map.keySet()) {
            for (int neighbour : map.get(node)) {
                indeg[neighbour]++;
            }
        }
    }

    public void topSort() {
        int[] indeg = new int[map.size()];
        calcIndeg(indeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.offer(i);
            }
        }
        // bfs
        while (!q.isEmpty()) {
            int currNode = q.poll();
            System.out.print(currNode + " "); // printing topological sort

            for (int neighbour : map.get(currNode)) {
                indeg[neighbour]--;
                if (indeg[neighbour] == 0) {
                    q.offer(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        TopologicalSortBFS g = new TopologicalSortBFS(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.topSort(); 
    }
}
