package Graphs;

import java.util.*;

public class CycleInDirectedGraphUsingDFT {
    // Directed Graph
    HashMap<Integer, List<Integer>> map;

    public CycleInDirectedGraphUsingDFT(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int from, int to) {
        map.get(from).add(to); // Directed edge
    }

    // detecting cycle in directed graph using Depth First Traversal
    public boolean detectCycle() {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> inCurrentPath = new HashSet<>();

        for (int node : map.keySet()) {
            if (!visited.contains(node)) {
                if (dfs(node, visited, inCurrentPath)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int node, Set<Integer> visited, Set<Integer> inCurrentPath) {
        visited.add(node);
        inCurrentPath.add(node);

        for (int neighbor : map.get(node)) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, visited, inCurrentPath)) {
                    return true;
                }
            } else {
                // Found a back edge → cycle (edge that points back to an ancestor i.e., node1 ⇄ node2)
                // Only here you check if neighbor is in current path (cycle)
                if (inCurrentPath.contains(neighbor)) {
                    return true;
                }
            }
        }

        inCurrentPath.remove(node); // Done exploring this path
        return false;
    }

    public static void main(String[] args) {
    // Graph 1: Cycle exists (2 -> 3 -> 4 -> 2)
    CycleInDirectedGraphUsingDFT g1 = new CycleInDirectedGraphUsingDFT(4);
    g1.addEdge(1, 2);
    g1.addEdge(2, 3);
    g1.addEdge(3, 4);
    g1.addEdge(4, 2);
    System.out.println("Graph 1 has cycle? " + g1.detectCycle()); // true

    // Graph 2: No cycle 
    CycleInDirectedGraphUsingDFT g2 = new CycleInDirectedGraphUsingDFT(4);
    g2.addEdge(1, 2);
    g2.addEdge(2, 3);
    g2.addEdge(2, 4);
    System.out.println("Graph 2 has cycle? " + g2.detectCycle()); // false

    // Graph 3: Multiple components, one cycle (1 -> 2 -> 3 -> 1)
    CycleInDirectedGraphUsingDFT g3 = new CycleInDirectedGraphUsingDFT(5);
    g3.addEdge(1, 2);
    g3.addEdge(2, 3);
    g3.addEdge(3, 1);
    g3.addEdge(4, 5);
    System.out.println("Graph 3 has cycle? " + g3.detectCycle()); // true

    // Graph 4: Single node, no edges
    CycleInDirectedGraphUsingDFT g4 = new CycleInDirectedGraphUsingDFT(1);
    System.out.println("Graph 4 has cycle? " + g4.detectCycle()); // false
}

}
