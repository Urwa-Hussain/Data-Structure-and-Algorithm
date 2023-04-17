
package arraymain.fun;

public class InsertionOperation {
    public static void InsertionOperation(int arr[], int size, int position, int element) {
        for (int i = size; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = element;
    }
}  
