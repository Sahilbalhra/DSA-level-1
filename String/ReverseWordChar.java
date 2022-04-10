// 557. Reverse Words in a String III
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
// Example 1:

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2:

// Input: s = "God Ding"
// Output: "doG gniD"

import java.util.Scanner;
public class ReverseWordChar {
    public static void reverse(char [] rev,int i,int j){
        while(i<=j){
            char temp=rev[i];
            rev[i]=rev[j];
            rev[j]=temp;
            i++;
            j--;
        }
    }
    public static String reverseWords(String s) {
        char[] rev=s.toCharArray();
        int i=0;
        for(int j=0;j<rev.length;j++){
            if(rev[j]==' '){
                reverse(rev ,i,j-1);
                i=j+1;
            }
        }
         reverse(rev ,i,rev.length-1);
        
        return new String(rev);
        
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(reverseWords(str));
        scn.close();
      }
    
}
