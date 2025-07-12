package Graphs;

public class FloydWarshallAlgorithm {
    static final int INFINITY = 1000_000_000; // a large number to represent infinity
    public static void main(String[] args) {
        int[][] graph = {
                { 0, 5, INFINITY, 10 },
                { INFINITY, 0, 3, INFINITY },
                { INFINITY, INFINITY, 0, 1 },
                { INFINITY, INFINITY, INFINITY, 0 }
        };

        floydWarshall(graph);
    }

    // floyd warshall algo
    public static void floydWarshall(int[][] graph) {
        int n = graph.length; // number of vertices
        // ab bnaenge distance(dis) matrix dp wala
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = graph[i][j];
                }
            }
        }
        // Dynamic programming lgaenge ab - Try all intermediate vertices(matlab iski
        // via uske via kitni cost mein jaa skte)
        for (int via = 0; via < n; via++) {
            for (int i = 0; i < n; i++) { // source vertex
                for (int j = 0; j < n; j++) { // destination vertex
                    // bcoz agar infinity + infinity krdiya toh value out of int ki limit jaa sakti
                    // hai
                    if (dist[i][via] < INFINITY && dist[via][j] < INFINITY) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][via] + dist[via][j]);
                    }
                }
            }
        }

        // krwado print ab
        printSolution(dist);
    }

    public static void printSolution(int[][] dist) {
        int n = dist.length;
        System.out.println("All-Pairs Shortest Path Matrix:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (dist[i][j] == INFINITY)
                    System.out.print("∞ ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

}
