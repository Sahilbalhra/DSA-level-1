// Take as input N, a number. Write a recursive function which prints counting
// from 1 to N in lexicographical order. In lexicographical (dictionary) order 10,
// 100 and 109 will be printed before 11.


// Example(To be used only for expected output):
// Input:
// 20
// output
// 1
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9


import java.util.*;

public class LaxicographicalPrinting {
    public static void printNum(int i, int n) {
        if (i > n) {
            return;
        }
        if (i < n) {
            System.out.println(i);
        }

        for (int j = 0; j < 10; j++) {
            printNum(10 * i + j, n);
        }

    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= 9; i++) {
            printNum(i, n);
        }
        scn.close();

    }

}
