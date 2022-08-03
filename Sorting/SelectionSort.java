package Sorting;

public class SelectionSort {
    public static void output(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 7, 8, 3, 1, 2 };
        int n = arr.length;

        // selection sort

        // like bubble sort
        //smallest number at 1st place

        for (int i = 0; i < n - 1; i++) {
            int small = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }

            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }

        output(arr, n);
        //tc is O(n^2);
    }

}
