package Graphs;

// Using Tarjans algorithm to find Bridges in Graph

import java.util.*;

public class TarjansAlgo_ArticulationPoint {
    public static void main(String[] args) {
        int vertices = 5;
        TarjansAlgo_ArticulationPoint g = new TarjansAlgo_ArticulationPoint(vertices);

        g.AddEdge(0, 1);
        g.AddEdge(0, 2);
        g.AddEdge(2, 3);
        g.AddEdge(3, 4);
        g.AddEdge(4, 2);

        System.out.println("Articulation Points in the graph:");
        g.findArticulationPoint();
    }

    // Graph
    private int time;
    private HashSet<Integer> visited;
    HashMap<Integer, List<Integer>> graph;

    public TarjansAlgo_ArticulationPoint(int v) {
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

    // To get all articulation points of graph
    public void findArticulationPoint() {
        int[] disc = new int[graph.size()]; // array of discovery time of vertices
        int[] low = new int[graph.size()]; // lowest discovery time of neighbours
        // Run DFS from every unvisited vertex (handles disconnected graphs)
        for (int vertex : graph.keySet()) {
            if (!visited.contains(vertex)) {
                dfs(vertex, -1, disc, low);
            }
        }
    }

    private void dfs(int curr, int parent, int[] disc, int[] low) {
        visited.add(curr);
        disc[curr] = low[curr] = ++time;
        int children = 0;
        for (int neighbour : graph.get(curr)) {
            if (neighbour == parent)
                continue;
            if (!visited.contains(neighbour)) {
                dfs(neighbour, curr, disc, low);
                low[curr] = Math.min(low[curr], low[neighbour]);
                // checking for bridge
                if (parent != -1 && low[neighbour] >= disc[curr]) {
                    System.out.println("Articulation Point : " + curr);
                }
                children++;
            } else {
                low[curr] = Math.min(low[curr], disc[neighbour]);
            }
        }
        if (parent == -1 && children > 1) {
            System.out.println("Articulation Point : " + curr);
        }
    }
}
