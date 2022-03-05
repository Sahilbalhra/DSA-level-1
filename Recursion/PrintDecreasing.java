
// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1.
// 3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.
// Sample Input
// 5
// Sample Output
// 5
// 4
// 3
// 2
// 1

import java.util.Scanner;

public class PrintDecreasing {
    public static void solution(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        solution(n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        solution(n);
        scn.close();
    }
    
}
