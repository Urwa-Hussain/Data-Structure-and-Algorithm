package arraymain.fun;
import java.util.Scanner;
public class ArrayMainFun {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Sorting sort = new Sorting();
        int[] arr = new int[100];
        arr[0] = 20;
        arr[1] = 34;
        arr[2] = 50;
        arr[3] = 78;
        arr[4] = 98;
        
//        sort.SelectionSorting(size, arr);
//        TraversalOperation.TraversalOperation(arr, 5);
          int size = 5, position = 3, element = 45;
//        InsertionOperation.InsertionOperation(arr, size, position, element);
//        size++;
//        TraversalOperation.TraversalOperation(arr, size);
//        DeletionOperation.DeletionOperation(arr, size, position, element);
//        size--;
//        TraversalOperation.TraversalOperation(arr, size);

        UpdationOperation.UpdateOperation(arr, size, position, element);
        TraversalOperation.TraversalOperation(arr, size);

//        System.out.println("Enter the number you want to search: ");
//        int num = scanner.nextInt();
//        SearchOperation.SearchOperation(arr, size, position, num);
    }
}
