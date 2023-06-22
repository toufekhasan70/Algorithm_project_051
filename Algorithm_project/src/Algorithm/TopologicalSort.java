package Algorithm;
import java.util.*;

public class TopologicalSort {
    private int V;
    private ArrayList<ArrayList<Integer> > adj;
 
    public TopologicalSort(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer> >(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<Integer>());
    }
 
    void addEdge(int v, int w) { adj.get(v).add(w); }
 
    void topologicalSortUtil(int v, boolean visited[],
                             Stack<Integer> stack)
    {
        visited[v] = true;
        Integer i;
 
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }
 
        stack.push(new Integer(v));
    }
 
    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);
        System.out.print("\u001B[34mThe result of topological sort is: \u001B[0m");
        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
        System.out.println();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001B[34m============== Topological Sort ==============\u001B[0m");
        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        TopologicalSort graph = new TopologicalSort(V);

        // Adding edges
        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();
        System.out.println("Enter the edges (source destination):");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u, v);
        }
        // Perform topological sort
        graph.topologicalSort();
    }
}
