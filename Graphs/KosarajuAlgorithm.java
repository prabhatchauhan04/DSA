package Graphs;

// Tells number of SCC or all the SCC (Strongly Connected Components)

import java.util.*;

public class KosarajuAlgorithm {
    HashMap<Integer,List<Integer>> map;
    HashMap<Integer, List<Integer>> reversedGraph;
    public KosarajuAlgorithm(int v){
        map = new HashMap<>();
        reversedGraph = new HashMap<>();
        for(int i = 1; i <= v ; i++){
            map.put(i , new ArrayList<>());
        }
    }
    public void addEdge(int v1 , int v2){
        map.get(v1).add(v2);
    }
    public static void main(String[] args) {
        KosarajuAlgorithm g = new KosarajuAlgorithm(5);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.addEdge(2,4);
        g.addEdge(4 , 5);
        g.Kosaraju();
    }
    // Reverse all edges to create the transposed graph
    private void reverseGraph() {
        for (int u : map.keySet()) {
            for (int v : map.get(u)) {
                reversedGraph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
            }
        }
    }
    // step 1 dfs function to find finish times(yha stack fill krwa rhe honge)
    private void dfs1(int node , Stack<Integer> st , HashSet<Integer> visited){
        visited.add(node);
        for(int neighbour : map.get(node)){
            if(!visited.contains(neighbour)){
                dfs1(neighbour , st , visited);
            }
        }
        st.push(node);
    }
    // step 3 dfs function to find SCC's(yha bas traverse)
    private void dfs3(int node , HashSet<Integer> visited){
        visited.add(node);
        for(int neighbour : reversedGraph.getOrDefault(node, new ArrayList<>())){
            if(!visited.contains(neighbour)){
                dfs3(neighbour , visited);
            }
        }
    }
    // Kosaraju algo jo step 1 , step 2 aur step 3 perform krwaega
    // prints number of SCC's
    public void Kosaraju(){
         // Step 1: DFS to fill stack
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        // in case agar graph connected na ho
        for(int vertex : map.keySet()){
            if(!visited.contains(vertex)){
                dfs1(vertex, st, visited);
            }
        }
        // Step 2: Reverse the graph
        reverseGraph();
        // Step 3: DFS on reversed graph using finishing time/order
        visited.clear(); // Reset visited set
        int SCC = 0; 
        while (!st.isEmpty()) {
            int node = st.pop();
            if (!visited.contains(node)) {
                dfs3(node, visited);
                SCC++;
            }
        }
        System.out.println("The number of Strongly Connected Components in Graph : " + SCC);
    }
}
