package graphtraversal;

import java.util.*;

public class GraphTraversal {

    // A function to add edges to the graph
    static void add_edge(ArrayList<Integer>[] adj, int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    // A function to perform BFS traversal of the graph
    static void BFS(ArrayList<Integer>[] adj, int s, boolean[] visited) {
        Queue<Integer> q = new LinkedList<Integer>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    static void DFS(ArrayList<Integer>[] adj, int s, boolean[] visited) {
        Stack<Integer> st = new Stack<Integer>();
        visited[s] = true;
        st.push(s);
        while (!st.empty()) {
            int u = st.pop();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    st.push(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;                              // number of vertices in the graph
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        boolean[] visited = new boolean[V];    // array to keep track of visited vertices
        // Adding edges to the graph
        add_edge(adj, 0, 1);
        add_edge(adj, 0, 2);
        add_edge(adj, 1, 3);
        add_edge(adj, 1, 4);
        add_edge(adj, 2, 4);
        add_edge(adj, 3, 4);
        add_edge(adj, 3, 5);
        System.out.print("BFS Traversal: ");
        BFS(adj, 0, visited);                   // perform BFS traversal starting from vertex 0
        System.out.println();
        // Reset visited array
        Arrays.fill(visited, false);
        System.out.print("DFS Traversal: ");
        DFS(adj, 0, visited);                   // perform DFS traversal starting from vertex 0
        System.out.println();
    }

}
