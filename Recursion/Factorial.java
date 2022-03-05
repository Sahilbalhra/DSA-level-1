
// 1. You are given a number n.
// 2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.
// Example
// Sample Input
// 5
// Sample Output
// 120

import java.util.Scanner;

public class Factorial {
    public static int solution(int n){
        if(n==0||n==1){
            return 1;
        }
       int fn=solution(n-1);
       return n*fn;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int ans=solution(n);
        System.out.println(ans);
        scn.close();
        
    }
    
}
