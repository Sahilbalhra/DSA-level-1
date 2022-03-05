
// 1. You are given a positive number n. 
// 2. You are required to print the counting from 1 to n.
// 3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.
// Sample Input
// 5
// Sample Output
// 1
// 2
// 3
// 4
// 5

import java.util.Scanner;

public class PrintIncreasing {
    public static void solution(int n){
        if(n==0){
            return ;
        }
        solution(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        solution(n);
        scn.close();
    }
    
}
