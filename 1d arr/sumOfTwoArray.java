import java.util.*;

public class sumOfTwoArray {
    public static Scanner scn = new Scanner(System.in);

    // input array
    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    // output array
    public static void output(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // sum arr
    public static void sum(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int[] sum = new int[n > m ? n : m];
        int k = sum.length - 1;
        while (k >= 0) {
            int d = carry;
            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }
            carry = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            System.out.println(carry);
        }
        output(sum);

    }

    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        input(arr1);
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        input(arr2);
        sum(arr1, arr2);

    }

}
