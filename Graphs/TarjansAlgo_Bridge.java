package Graphs;

// Using Tarjans algorithm to find Bridges in Graph

import java.util.*;

public class TarjansAlgo_Bridge {
    public static void main(String[] args) {
        int vertices = 5;
        TarjansAlgo_Bridge g = new TarjansAlgo_Bridge(vertices);

        g.AddEdge(0, 1);
        g.AddEdge(0, 2);
        g.AddEdge(2, 3);
        g.AddEdge(3, 4);
        g.AddEdge(4, 2);

        System.out.println("Bridges in the graph:");
        g.findBridges();
    }

    // Graph
    int time;
    HashMap<Integer, List<Integer>> graph;
    HashSet<Integer> visited;

    public TarjansAlgo_Bridge(int v) {
        time = 0;
        visited = new HashSet<>();
        graph = new HashMap<>();
        for (int i = 0; i < v; i++) {
            graph.put(i, new ArrayList<>()); // har ek vertex k liye nyi list attach krdo
        }
    }

    public void AddEdge(int v1, int v2) {
        graph.get(v1).add(v2);
        graph.get(v2).add(v1);
    }

    // To get all bridges of graph
    public void findBridges() {
        int[] disc = new int[graph.size()]; // array of discovery time of vertices
        int[] low = new int[graph.size()]; // lowest discovery time of neighbours
        // Run DFS from every unvisited vertex (handles disconnected graphs)
        for (int vertex : graph.keySet()) {
            if (!visited.contains(vertex)) {
                dfs(vertex, -1, disc, low);
            }
        }
    }

    public void dfs(int curr, int parent, int[] disc, int[] low) {
        visited.add(curr);
        disc[curr] = low[curr] = ++time;
        for (int neighbour : graph.get(curr)) {
            if (neighbour == parent)
                continue;
            if (!visited.contains(neighbour)) {
                dfs(neighbour, curr, disc, low);
                // Check if the subtree rooted at neighbour has a connection back to curr or its
                // ancestors(checking for backedge)
                low[curr] = Math.min(low[curr], low[neighbour]);
                // checking for bridge
                if (low[neighbour] > disc[curr]) {
                    System.out.println("Bridge : " + curr + "----" + neighbour);
                }
            } else {
                // backedge case
                low[curr] = Math.min(low[curr], disc[neighbour]);
            }
        }
    }
}
