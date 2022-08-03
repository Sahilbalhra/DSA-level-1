package Sorting;

public class InsertionSort {
    public static void output(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        int n = arr.length;

        // Insertion Sort Algorithm
        // To sort an array of size N in ascending order:

        // Iterate from arr[1] to arr[N] over the array.
        // Compare the current element (key) to its predecessor.
        // If the key element is smaller than its predecessor, compare it to the
        // elements before. Move the greater elements one position up to make space for
        // the swapped element.

        for(int i=0;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr <arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=curr;
        }

        output(arr, n);

        // tc O(n^2)

    }

}
