package adjacencymatrix;

public class AdjacencyMatrix {
    
    public static void main(String[] args) {
        int v = 6;
        Functions g = new Functions();
        g.edgeadd(0, 4); // (source,destination)
        g.edgeadd(0, 3);
        g.edgeadd(1, 2);
        g.edgeadd(1, 4);
        g.edgeadd(1, 5);
        g.edgeadd(2, 3);
        g.edgeadd(2, 5);
        g.edgeadd(5, 3);
        g.edgeadd(5, 4);
        g.displaymatrix(v);
    }
}


