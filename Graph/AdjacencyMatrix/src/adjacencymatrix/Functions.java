
package adjacencymatrix;

public class Functions {
    int vertarr[][] = new int[20][20];
    //int count = 0;

    void displaymatrix(int v) {
        int i, j;
        for (i = 0; i < v; i++) {
            for (j = 0; j < v; j++) {
                System.out.print(vertarr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void edgeadd(int u, int v) {
        vertarr[u][v] = 1;
        vertarr[v][u] = 1;
    }
}
