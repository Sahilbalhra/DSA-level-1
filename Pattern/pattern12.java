package Pattern;
import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 0;
        int num1 = 1;
        int num2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num2 = num + num1;
                num = num1;
                num1 = num2;
            }
            System.out.println();
        }
        scn.close();
    }

}
