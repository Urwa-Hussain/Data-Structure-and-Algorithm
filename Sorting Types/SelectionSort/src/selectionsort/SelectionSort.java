package selectionsort;
import java.util.Scanner;
public class SelectionSort {

    public static void main(String[] args) {
        SelectingSorting s = new SelectingSorting();

        System.out.println("Enter the size for array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int myarr[] = new int[size];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {
            myarr[i] = sc.nextInt();
        }
        System.out.println("Before sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.print(myarr[i] + " ");
        }
        System.out.println();
        System.out.println("After sorting: ");
        s.printarray(myarr);

    }
}


