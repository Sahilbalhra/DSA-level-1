package Pattern;
import java.util.*;

public class pattern14 {
    public static Scanner scn = new Scanner(System.in);

    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        table(n);

    }

}
