package Algorithm;
import algorithm_project.Algorithms_2019_051;
import algorithm_project.Input;

import java.util.*;


public class BFS {
    private LinkedList<Integer>[] adj;

    public void gBFS() {
        Scanner s = new Scanner(System.in);
        Graph g = new Graph();
        g.GraphImp();
        adj = g.getAdjList();

        System.out.println("============== BFS Traversal ==============");
        System.out.println("Enter the source node: ");
        int src = s.nextInt();

        boolean visited_nodes[] = new boolean[adj.length];
        int parent_nodes[] = new int[adj.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited_nodes[src] = true;
        parent_nodes[src] = -1;

        while (!q.isEmpty()) {
            int p = q.poll();
            System.out.print(p+"  ");
            for (int i : adj[p]) {
                if (!visited_nodes[i]) {
                    visited_nodes[i] = true;
                    q.add(i);
                    parent_nodes[i] = p;
                }
            }
        }
        System.out.println();
    }
}
