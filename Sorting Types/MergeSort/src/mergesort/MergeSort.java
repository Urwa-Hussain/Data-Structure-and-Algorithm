package mergesort;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
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
        MergeSorting m = new MergeSorting();
        m.mergesorting(myarr, 0, size - 1, size);
        for (int i = 0; i < size; i++) {
            System.out.print(myarr[i] + " ");
        }
    }
}
