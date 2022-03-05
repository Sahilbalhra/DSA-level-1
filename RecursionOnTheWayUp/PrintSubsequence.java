// 1. You are given a string str.
// 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Sample Input
// yvTA

// Sample Output
// yvTA
// yvT
// yvA
// yv
// yTA
// yT
// yA
// y
// vTA
// vT
// vA
// v
// TA
// T
// A

import java.util.*;
public class PrintSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        String str =scn.next();
        printSS(str,"");
        scn.close();

    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //char
        char ch=str.charAt(0);
        //rest of the string
        String ros = str.substring(1);

        //with ch
        printSS(ros,ans+ch);

        //without
        printSS(ros,ans);
        
    }

    
}
