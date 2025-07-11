package Graphs;

import java.util.*;

public class TopologicalSortDFS {
    private HashMap<Integer, List<Integer>> map;

    public TopologicalSortDFS(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    // Directed Graph
    public void addEdge(int v1, int v2) {
        map.get(v1).add(v2);
    }

    // Topological Sort using DFS
    public void topSort() {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();

        for (int node : map.keySet()) {
            if (!visited.contains(node)) {
                topSortUtil(node, visited, st); // dfs hi hai ye function
            }
        }

        while (!st.isEmpty()) {
            int val = st.pop();
            System.out.print(val + " ");
        }
    }

    public void topSortUtil(int currNode, HashSet<Integer> visited, Stack<Integer> st) {
        visited.add(currNode);

        for (int neighbour : map.get(currNode)) {
            if (!visited.contains(neighbour)) {
                topSortUtil(neighbour, visited, st);
            }
        }

        st.push(currNode);
    }

    public static void main(String[] args) {
        TopologicalSortDFS g1 = new TopologicalSortDFS(4);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(2, 4);
        g1.addEdge(3, 4);
        g1.topSort();
    }
}
