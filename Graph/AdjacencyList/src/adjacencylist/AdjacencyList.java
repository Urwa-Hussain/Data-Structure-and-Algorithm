package adjacencylist;

public class AdjacencyList {

    static class AdjListNode {
        int data;
        AdjListNode next = null;
    }

    static class AdjList {
        AdjListNode head = null;
    }

    static class Graph {

        private int V;
        private AdjList[] array;

        public Graph(int V) {
            this.V = V;
            array = new AdjList[V];

            for (int i = 0; i < V; i++) {
                array[i] = new AdjList();
                array[i].head = null;
            }
        }

        public void addEdge(int src, int dest) {
            AdjListNode newNode = new AdjListNode();
            newNode.data = dest;
            newNode.next = null;
            newNode.next = array[src].head;
            array[src].head = newNode;
            newNode = new AdjListNode();
            newNode.data = src;
            newNode.next = null;
            newNode.next = array[dest].head;
            array[dest].head = newNode;
        }

        public void printGraph() {
            for (int v = 0; v < V; v++) {
                AdjListNode tmp = array[v].head;
                System.out.print("\nAdjacency list of vertex " + v + "\nhead ");
                while (tmp != null) {
                    System.out.print("-> " + tmp.data);
                    tmp = tmp.next;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph gh = new Graph(5);
        gh.addEdge(0, 1);
        gh.addEdge(0, 4);
        gh.addEdge(1, 2);
        gh.addEdge(1, 3);
        gh.addEdge(1, 4);
        gh.addEdge(2, 3);
        gh.addEdge(3, 4);
        // print the adjacency list representation of the above graph
        gh.printGraph();
    }
}
