
// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//    For "abecd", the answer should be "a1b3e-2c1d", as 
//    'b'-'a' = 1
//    'e'-'b' = 3
//    'c'-'e' = -2
//    'd'-'c' = 1

import java.util.Scanner;

public class StringWithDifference {
    public static void solution(String str){
        String s="";
        
        for(int i=0;i<str.length()-1;i++){
            s+=str.charAt(i);
            char curr=str.charAt(i);
            char next=str.charAt(i+1);
            int num=next-curr;
            s+=num;
        }
        s+=str.charAt(str.length()-1);
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();
        solution(str);
        scn.close();
        
    }
    
}
