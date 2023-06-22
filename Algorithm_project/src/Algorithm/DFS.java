package Algorithm;
import algorithm_project.Input;
import java.util.*;

public class DFS {
    
    private LinkedList<Integer>[] adj;

    public void gDFS() {
        Scanner s = new Scanner(System.in);
        Graph g = new Graph();
        g.GraphImp();
        adj = g.getAdjList();

        System.out.println("============== DFS Traversal ==============");
        System.out.println("Enter the source node: ");
        int src = s.nextInt();

        boolean visited_nodes[] = new boolean[adj.length];
        int parent_nodes[] = new int[adj.length];
        Stack<Integer> st = new Stack<>();
        st.add(src);
        visited_nodes[src] = true;
        parent_nodes[src] = -1;

        while (!st.isEmpty()) {
            int p = st.pop();
            System.out.print(p+"  ");
            for (int i : adj[p]) {
                if (!visited_nodes[i]) {
                    visited_nodes[i] = true;
                    st.add(i);
                    parent_nodes[i] = p;
                }
            }
        }
        System.out.println();
    }
}
