
package arraymain.fun;

public class SearchOperation {
    public static void SearchOperation(int arr[], int size, int position, int num) {
        for (int i = 0; i <= size; i++) {
            if (arr[i] == num) {
                System.out.println("The item you searched is " + num + " at index " + i);
            }
        }
    }
}
