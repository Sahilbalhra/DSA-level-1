
// span a array that is difference between min and max value
import java.util.*;

public class span {
    public static Scanner scn = new Scanner(System.in);

    // input array
    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    // span function
    public static void spanDiff(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        System.out.println(max - min);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        spanDiff(arr);
    }
}
