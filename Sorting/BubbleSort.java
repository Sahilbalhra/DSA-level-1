package Sorting;

public class BubbleSort {
    public static void output(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // bubble sort
        int[] arr = { 5, 2, 1, 3, 4 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            //filling at the last 
            //checking alternative element
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        output(arr, n);
        // t and s c is O(n^2)
    }

}
