package Recursion;
// 1. You are given a string str. 
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str. Use sample input and output to take idea about subsequences. Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Sample Input
// abc

// Sample Output
// [, c, b, bc, a, ac, ab, abc]

import java.util.ArrayList;
import java.util.Scanner;


class GetSubsequence{
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList <String> base=new ArrayList<>();
            base.add(" ");
            return base;
        }

        char ch=str.charAt(0); //a
        String ros=str.substring(1);//bc

        //getting the recursion ans
        ArrayList <String> recAns=gss(ros);
        //creating arraylist for ans
        ArrayList <String> myAns=new ArrayList<>();

        //without a 
        for(String x:recAns){
            myAns.add(x);
        }

        //with a
        for(String x:recAns){
            myAns.add(ch+x);
        }
        return myAns;
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String s=scn.next();
        ArrayList <String> ans=gss(s);
        System.out.println(ans);
        scn.close();
    }

}