
import java.util.Scanner;

public class Palindrom{
    public static boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            char left=str.charAt(i);
            char right=str.charAt(j);
            if(left!=right){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void solution(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String s=str.substring(i,j);
                if(isPalindrom(s)){
                    System.out.println(s);
                } 
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str=scn.nextLine();
        solution(str);
        scn.close();
    }
}