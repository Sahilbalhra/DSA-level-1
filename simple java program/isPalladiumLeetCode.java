import java.util.*;

public class isPalladiumLeetCode {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.print(isPalindrome(x));
        scn.close();
    }

    public static boolean isPalindrome(int n) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            return true;
        else
            return false;

    }

}
