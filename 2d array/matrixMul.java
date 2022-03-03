import java.util.*;

public class matrixMul {
    // Scanner class
    public static Scanner scn = new Scanner(System.in);

    // input class
    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    // output class
    public static void output(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // multiplication function
    public static void multiplication(int[][] A, int[][] B) {
        int row = A.length;
        int rowOf2 = B.length;
        int col = B[0].length;
        int[][] C = new int[row][col];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < rowOf2; k++) {
                    sum = sum + A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        output(C);

    }

    public static void main(String[] args) {
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] arr1 = new int[r1][c1];
        input(arr1);
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        if (c1 != r2) {
            System.out.println("Invalid input");
        } else {
            int[][] arr2 = new int[r2][c2];
            input(arr2);
            multiplication(arr1, arr2);

        }

    }

}
