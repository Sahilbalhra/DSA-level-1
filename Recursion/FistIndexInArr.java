
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the first index at which x occurs in array a.

// Sample Input
// 6
// 15
// 11
// 40
// 4
// 4
// 9
// 4

// Sample Output
// 3
import java.util.Scanner;

public class FistIndexInArr {
    public static Scanner scn = new Scanner(System.in);

    // input arr
    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    // function
    public static void firstIndex(int[] arr, int x, int idx) {
        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == x) {
            System.out.println(idx);
            return;
        }
        firstIndex(arr, x, idx + 1);

    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        inputArr(arr);
        int find = scn.nextInt();
        firstIndex(arr, find, 0);
    }

}
