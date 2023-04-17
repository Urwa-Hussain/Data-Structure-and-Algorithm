package mergesort;

public class MergeSorting {

    void merge(int arr[], int lb, int mid, int ub, int size) {
        int i = lb;
        int k = lb;
        int j = mid + 1;
        int temp[] = new int[size];
        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else if (arr[j] <= arr[i]) {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ub) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int d = lb; d <= ub; d++) {
            arr[d] = temp[d];
        }
    }

    void mergesorting(int arr[], int lb, int ub, int size) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergesorting(arr, lb, mid, size);
            mergesorting(arr, mid + 1, ub, size);
            merge(arr, lb, mid, ub, size);
        }
    } 
}
