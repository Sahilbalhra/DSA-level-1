package Pattern;
import java.util.*;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    // star
                    System.out.print("*\t");

                } else if (i + j == n + 1) {
                    // star
                    System.out.print("*\t");

                } else {
                    System.out.print("\t");

                }

            }

            System.out.println();

        }
        scn.close();
    }

}
