import java.util.*;

public class isPalladiumLeetCode {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.print(isPalindrome(x));
        scn.close();
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            x = -x;

        }

        int temp = x;
        int pow = 1;
        while (temp != 0) {
            pow = pow * 10;
            temp = temp / 10;

        }
        pow = pow / 10;

        temp = x;
        while (pow != 0) {
            if (x / pow != temp % 10) {
                return false;
            }
            x = x % pow;
            pow = pow / 10;
            temp = temp / 10;

        }
        return true;
    }

}
