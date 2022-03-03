import java.util.*;

public class barChart {
    public static Scanner scn = new Scanner(System.in);

    // input array
    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    // height of barChart
    public static int height(int[] arr) {
        int max = -1;
        for (int ele : arr) {
            max = Math.max(max, ele);
        }
        return max;

    }

    // barChart
    public static void barchart(int[] arr) {
        int max = height(arr);

        for (int i = max; i > 0; i--) {
            for (int ele : arr) {
                if (ele >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        barchart(arr);

    }
}
