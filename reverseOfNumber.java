import java.util.*;

public class reverseOfNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long temp = n;
        long pow = 1;
        while (temp != 0) {
            temp = temp / 10;
            pow = pow * 10;

        }

        pow = pow / 10;

        temp = n;

        while (pow != 0) {
            int d = (int) (temp % pow);
            System.out.println(d);
            temp = temp / pow;
            pow = pow / 10;
        }
        scn.close();
    }
}