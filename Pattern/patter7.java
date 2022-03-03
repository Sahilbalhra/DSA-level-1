package Pattern;
import java.util.*;

public class patter7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 0;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            // star
            System.out.print("*\t");
            space++;
            System.out.println();

        }
        scn.close();
    }

}
