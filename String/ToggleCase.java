package String;
// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to toggle the case of every character of the given string.
// Sample Input
// pepCODinG
// Sample Output
// PEPcodINg

import java.util.Scanner;

public class ToggleCase {
    public static void solution(String str){
        String s="";
        for(int i=0; i<str.length();i++){
         char ch=str.charAt(i);
         if(ch>='A' && ch<='Z'){
             //uper to lower
             char lw=(char)(ch-'A'+'a');
             s+=lw;
         }else{
             //lower to uper
             char up=(char)(ch-'a'+'A');
             s+=up;
         }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        solution(str);
        scn.close();
        
    }
    
}
