
// 1. You are given a string. 

// 2. You have to compress the given string in the following two ways - 
//    First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//    For "aaabbccdee", the compressed string will be "abcde".
//    Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//    For "aaabbccdee", the compressed string will be "a3b2c2de2".

import java.util.Scanner;

public class StringCompression {
    public static void solution1(String str) {
        String s ="";
        s+=str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (prev != curr) {
                s += str.charAt(i);
            }
        }
        System.out.println(s);
    }
    public static void solution2(String str) {
        String s ="";
        s+=str.charAt(0);
        int count=1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if(prev==curr){
                count++;
            }else{
                if(count>1){
                    s+=count;
                    s += str.charAt(i);
                    count=1;
           
                }else{
                    s += str.charAt(i);
                }
  
            }
        }
        if(count>1){
            s+=count;
        }
        System.out.println(s);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution1(str);
        solution2(str);
        scn.close();

    }

}
