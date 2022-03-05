
import java.util.Scanner;

public class AllIndex {
    public static Scanner scn = new Scanner(System.in);

    // input arr
    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    // function
    public static void allIndex(int[] arr, int x, int idx) {
        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == x) {
            System.out.println(idx);
        
        }
        allIndex(arr, x, idx + 1);

    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        inputArr(arr);
        int find = scn.nextInt();
        allIndex(arr, find, 0);
    }

}
