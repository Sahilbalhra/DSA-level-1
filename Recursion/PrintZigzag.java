
import java.util.Scanner;
// 1. Here are a few sets of inputs and outputs for your reference
// Input1 -> 1
// Output1 -> 1 1 1

// Input2 -> 2
// Output2 -> 2 1 1 1 2 1 1 1 2

// Input2 -> 3
// Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

// 2. Figure out the pattern and complete the recursive function pzz to achieve the above for any positive number n.

public class PrintZigzag {
    public static void solution(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ " ");
        solution(n-1);
        System.out.print(n+ " ");
        solution(n-1);
        System.out.print(n+ " ");

    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        solution(n);
       
        scn.close();
    }
    
}
