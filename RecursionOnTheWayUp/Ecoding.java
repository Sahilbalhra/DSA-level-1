// 1. You are given a string str of digits. (will never start with a 0)
// 2. You are required to encode the str as per following rules
//     1 -> a
//     2 -> b
//     3 -> c
//     ..
//     25 -> y
//     26 -> z
// 3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
// Use the input-output below to get more understanding on what is required
// 123 -> abc, aw, lc
// 993 -> iic
// 013 -> Invalid input. A string starting with 0 will not be passed.
// 103 -> jc
// 303 -> No output possible. But such a string maybe passed. In this case print nothing.

// Sample Input
// 655196

// Sample Output
// feeaif
// feesf


import java.util.*;

class Ecoding {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(str, "");
        scn.close();

    }

    public static void printEncodings(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        } else if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch == '0') {
                return;
            } else {
                // getting char value in int from string /char
                int chv = ch - '0';
                // getting alphabets value using ascii
                char code = (char)('a' + chv - 1);
                System.out.println(asf + code);
            }
        } else {
            // for str value >=2

            char ch = str.charAt(0);
            // rest of the string
            String ros = str.substring(1);

            // for only 1st digit
            if (ch == '0') {
                return;
            } else {
                // getting char value in int from string /char
                int chv = ch - '0';
                // getting alphabets value using ascii
                char code = (char)('a' + chv - 1);
                printEncodings(ros, asf + code);
            }

            // for first 2 digit
            String ch12 = str.substring(0, 2);
            String ros12 = str.substring(2);
            int chv12 = Integer.parseInt(ch12);
            if (chv12 <= 26) {
                char code = (char) ('a' + chv12 - 1);
                printEncodings(ros12, asf + code);
            }
        }

    }
}