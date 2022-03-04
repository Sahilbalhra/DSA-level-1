package Recursion;
// 1. You are given a number n, representing the size of array a.

// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the elements of array from beginning to end each in a separate line.
// Sample Input
// 5
// 3
// 1
// 0
// 7
// 5
// Sample Output
// 3
// 1
// 0
// 7
// 5

import java.util.Scanner;

public class DisplayArr {
    public static void displayArr(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        displayArr(arr, 0);
        scn.close();

    }

}
