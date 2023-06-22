package Algorithm;

public class FloydWarshall {
    private final int INF = Integer.MAX_VALUE;

    public void floydWarshall(int[][] graph, int V) {
        int[][] dist = new int[V][V];

        // Initialize the distance matrix with the given graph
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Perform the Floyd-Warshall algorithm
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    // If vertex k is on the shortest path from i to j,
                    // then update the distance
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Print the shortest distances between all pairs of vertices
        System.out.println("\nThe following matrix shows the shortest distances between every pair of vertices\n\n");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(dist[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public void run() {
        System.out.println("\u001B[34m============== Floyd warshall's Algorithm ==============\u001B[0m");
        int V = 4; // Number of vertices
        int[][] graph = {
            {0, 5, INF, 10},
            {INF, 0, 3, INF},
            {INF, INF, 0, 1},
            {INF, INF, INF, 0}
        };

        FloydWarshall fw = new FloydWarshall();
        fw.floydWarshall(graph, V);
    }
}
