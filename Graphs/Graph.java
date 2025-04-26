package Graphs;

import java.util.*;

public class Graph {
    HashMap<Integer , HashMap<Integer , Integer>> map;
    public Graph(int v){
        map = new HashMap<>();
        // v : number of vertices
        // i = 1 to v because '1' based indexing lerhe(Vertices 1 se shuru hai)
        for (int i = 1 ; i <= v ; i++) {
            map.put(i , new HashMap<>()); 
        } 
    }
    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }
    public void Addvertex(int v) {
		map.put(v, new HashMap<>());
	}
    // tells if edge is present between vertex v1 and v2
	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}
    // tells if vertex v1 is present or not
	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}
    public int noofEdge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum += map.get(key).size();
		}
        // Divide by 2 bcoz har edge 2 baar count horhi
		return sum / 2;
	}
    public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
    public void removevertex(int v1) {
        // nbrs : neighbours of v1 vertex(Connected Vertices)
        // Har nbrs se bhi toh v1 ka data hataenge
		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}
	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
    // Tells if src(source) to des(destination) path exist krta ya nhi
    // Basic Recursive Approach(Graph ko 'src' se traverse krenge jab tk 'des' nhi pohonch jate)
    public boolean haspath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
        // taki jin nodes ko cross krke aaye the aage waha wapas na chle jae
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
            // agar visit kr chuke 'nbrs' node then waha nhi jaenge
			if (!visited.contains(nbrs)) {
				boolean ans = haspath(nbrs, des, visited);
				if (ans) {
					return ans;
				}
			}
		}
		return false;
	}
    // src to des k saare paths print krdega
    public void PrintAllPath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + des);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				PrintAllPath(nbrs, des, visited, ans + src);
			}
		}
        // backtrack kr rhe taki saare paths aasake
		visited.remove(src); // taki saari nodes k through jaakr src to des jae
	}
    public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		HashSet<Integer> visited = new HashSet<>();
		while (!q.isEmpty()) {
			// 1. remove
			int rv = q.poll();
			// 2. Ignore if Already Visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3. add visited
			visited.add(rv);
			// 4.self Work
			if (rv == des) {
				return true;
			}
			// 5. Add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}
    public boolean DFS(int src, int des) {
		Stack<Integer> s = new Stack<>();
		s.push(src);
		HashSet<Integer> visited = new HashSet<>();
		while (!s.isEmpty()) {
			// 1. remove
			int rv = s.pop();
			// 2. Ignore if Already Visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3. add visited
			visited.add(rv);
			// 4.self Work
			if (rv == des) {
				return true;
			}
			// 5. Add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}
		}
		return false;
	}
}