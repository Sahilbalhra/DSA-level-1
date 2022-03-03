package Pattern;
import java.util.*;

public class patter5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n / 2;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            if (n / 2 > i) {

                // space
                for (int j = 1; j <= space; j++) {
                    System.out.print("\t");
                }
                // star
                for (int k = 1; k <= star; k++) {
                    System.out.print("*\t");
                }

                space--;
                star = star + 2;
            } else if ((n / 2) + 1 == i) {
                // star
                for (int k = 1; k <= n; k++) {
                    System.out.print("*\t");
                }
                space--;
                star=star+2;

            } else {
                // space
                for (int j = 1; j <= space; j++) {
                    System.out.print("\t");
                }
                // star
                for (int k = 1; k <= star; k++) {
                    System.out.print("*\t");
                }

                space++;
                star = star - 2;

            }
            System.out.println();
        }
        scn.close();
    }

}
