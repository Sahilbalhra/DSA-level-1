import java.util.Scanner;

public class CharAddToMakePalindrom {
    public static int isPalindrom(String str, int n) {
        int i = 0;
        int j = n - 1;
        int count = 0;
        while (i <= j) {
            char left = str.charAt(i);
            char right = str.charAt(j);
            if (left != right) {
                count++;
            }
            i++;
            j--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        if (n == 3) {
            int case3 = isPalindrom(str, n);
            if (case3 == 1) {
                System.out.println(0);
            }

        } else {
            int ans = isPalindrom(str, n);

            if (ans == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);

            }

        }

        scn.close();

    }

}
