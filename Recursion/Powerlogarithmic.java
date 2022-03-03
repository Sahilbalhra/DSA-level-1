package Recursion;

import java.util.Scanner;

public class Powerlogarithmic {
    public static int power(int n, int p){
        if(p==0){
            return 1;
        }
        int rec=power(n,p/2);
        if(p%2==0){
            return rec*rec;
        }
        return rec*rec*n;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int pow=scn.nextInt();
        int myans=power(num,pow);
        System.out.println(myans);
        scn.close();
    }
    
}
