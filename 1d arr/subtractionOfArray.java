import java.util.*;

public class subtractionOfArray {
    public static Scanner scn = new Scanner(System.in);

    // input array
    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    // subtration array
    public static void sub(int[] arr1, int[] arr2) {
        int n = arr2.length;
        int[] sub = new int[n];

        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sub.length - 1;

        while (k >= 0) {
            int d = 0;
            int avl = i >= 0 ? arr1[i] : 0;
            if (arr2[j] + carry >= avl) {
                d = arr2[j] + carry - avl;
                carry = 0;
            } else {
                d = arr2[j] + carry + 10 - avl;
                carry = -1;

            }
            sub[k] = d;
            k--;
            i--;
            j--;

        }
        int index = 0;
        for (int ele : sub) {
            if (ele == 0) {
                index++;
            } else {
                break;
            }
        }
        for (int z = index; z < sub.length; z++) {
            System.out.println(sub[i]);
            
        }
    }

    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        input(arr1);
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        input(arr2);
        sub(arr2, arr1);
    }

}
