package Pattern;

import java.util.*;

public class NumberPattern {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int ans = 0;
        String str = "";
        for (int i = 1; i <= num; i++) {

            ans += i;
            if (i == 1) {
                str += i;
                System.out.println(str + " = " + ans);
            } else {
                str += " + " + i;
                System.out.println(str + " = " + ans);
            }
        }
        scn.close();
    }

}
