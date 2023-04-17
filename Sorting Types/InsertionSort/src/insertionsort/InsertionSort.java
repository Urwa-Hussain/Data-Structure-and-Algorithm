package insertionsort;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int temp = array[i]; //index ki value temp ma store kr lain gay ta k bad ma use k sakain aur jagha bhi khali ho sky.
            int j = i - 1; //0    // pichli values sy compare karain gay
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
