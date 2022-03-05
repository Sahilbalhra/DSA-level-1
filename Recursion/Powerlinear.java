
// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function .
// Sample Input
// 2
// 5
// Sample Output
// 32

import java.util.Scanner;

public class Powerlinear {
    public static int power(int n,int p){
        if(p==0){
            return 1;
        }
        int rec=power(n, p-1);
        int ans =n*rec;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        int pow=scn.nextInt();
        int myans=power(num,pow);
        System.out.println(myans);
        scn.close();
        
    }
    
}
