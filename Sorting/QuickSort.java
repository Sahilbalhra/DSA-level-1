package Sorting;
//pivot and partion

//selection of pivot methods are
//1 random
//2 median
//3 1st element
//4 last element

//in this we use last element as a pivot

//algo

//1) select the pivot
//2) arrange smaller number the pivot to the left
//3) arrange gratter number the pivot to the right

public class QuickSort {
    public static void output(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        quickSort(arr, 0, n);
        output(arr, n);

        //Time Complexicity
        //avg nlogn
        //worst n^2

    }

}
