package Algorithm;
import java.util.*;

public class Kruskals {

    public Kruskals() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public int compareTo(Edge otherEdge) {
            return this.weight - otherEdge.weight;
        }
    }

    int V, E;
    Edge edge[];

    public Kruskals(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }

    int find(int parent[], int i) {
        if (parent[i] == i)
            return i;
        return find(parent, parent[i]);
    }

    void union(int parent[], int x, int y) {
        int xroot = find(parent, x);
        int yroot = find(parent, y);
        parent[xroot] = yroot;
    }

    void kruskalMST() {
        Edge result[] = new Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i < V; i++) {
            result[i] = new Edge();
        }

        Arrays.sort(edge);

        int parent[] = new int[V];

        for (int v = 0; v < V; v++) {
            parent[v] = v;
        }

        i = 0;

        while (e < V - 1) {
            Edge nextEdge = edge[i++];

            int x = find(parent, nextEdge.src);
            int y = find(parent, nextEdge.dest);

            if (x != y) {
                result[e++] = nextEdge;
                union(parent, x, y);
            }
        }

        System.out.println("\nEdges in the minimum spanning tree:");
        System.out.println("Edge \t\tWeight");
        int cost = 0;
        for (i = 0; i < e; ++i) {
            System.out.println(result[i].src + " <--> " + result[i].dest + "\t\t" + result[i].weight);
            cost +=result[i].weight;         
        }
        System.out.println("Minimum cost is: "+cost);
        
    }

    public void run() {
        System.out.println("----------------------- Kruskal's Algorithm -----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vertices: ");
        int V = scanner.nextInt();
        System.out.print("Enter edges: ");
        int E = scanner.nextInt();

        Kruskals kruskal = new Kruskals(V, E);

        for (int i = 0; i < E; i++) {
            System.out.println("Enter details for edge " + (i + 1));
            //System.out.print("Enter source vertex: ");
            int src = scanner.nextInt();
           // System.out.print("Enter destination vertex: ");
            int dest = scanner.nextInt();
           // System.out.print("Enter weight: ");
            int weight = scanner.nextInt();

            kruskal.edge[i].src = src;
            kruskal.edge[i].dest = dest;
            kruskal.edge[i].weight = weight;
        }
        kruskal.kruskalMST();
    }
}
