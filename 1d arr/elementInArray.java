import java.util.*;

public class elementInArray {
    public static Scanner scn = new Scanner(System.in);

    // input array
    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    // check element in arr
    public static void check(int[] arr, int d) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {

                System.out.println(i);
                idx++;
            }
        }
        if (idx == -1) {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int d = scn.nextInt();
        check(arr, d);
    }

}
