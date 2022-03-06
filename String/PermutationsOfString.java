

import java.util.Scanner;

// 1. You are given a string. 
// 2. You have to print all permutations of the given string iteratively.
// Sample Input
// abc
// Sample Output
// abc
// bac
// cab
// acb
// bca
// cba
public class PermutationsOfString {
    public static int factorial(int n){
        int val=1;
        for(int i=2;i<=n;i++){
            val*=i;
        }
        return val;
    }
    public static void solution(String str){
        int n =str.length();
        int outerLoopCondition=factorial(n);
     
        //loop for number of permutation
        for(int i=0;i<outerLoopCondition;i++){
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for(int div=n;div>=1;div--){
                int  q=temp/div;
                int rem=temp%div;
                
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp=q;

            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();
        solution(str);
        scn.close();
    }
    
}
