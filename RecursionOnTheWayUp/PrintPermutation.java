// 1. You are given a string str.
// 2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
// Use sample input and output to take idea about permutations.
// Sample Input
// abc

// Sample Output
// abc
// acb
// bac
// bca
// cab
// cba

import java.util.*;
public class PrintPermutation {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printPermutations(str,"");
        scn.close();

    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i=0;i<str.length();i++){

        //first char
        char ch=str.charAt(i);

         String left=str.substring(0,i);
        String right=str.substring(i+1);

        //rest of the string
        String ros=left+right;
        printPermutations(ros,asf+ch);
        }
    }

    
}
