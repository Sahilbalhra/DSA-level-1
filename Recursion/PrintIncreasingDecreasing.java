package Recursion;
// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1 and back to n again.
// 3. You are required to not use any loops. Complete the body of pdi function to achieve it. Don't change the signature of the function.
// Sample Input
// 3
// Sample Output
// 3
// 2
// 1
// 1
// 2
// 3

import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void solution(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        solution(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        solution(n);
        scn.close();
        
    }
    
}
