import java.util.*;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        while (num != 0) {
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;

        }
        scn.close();
    }

}
