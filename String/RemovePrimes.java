
// 1. You are given an ArrayList of positive integers.
// 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList. Note -> The order of elements should remain same.
// Sample Input
// 4
// 3 12 13 15
// Sample Output
// [12, 15]

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {
    //fuction to check prime number 
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void solution(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            if(isPrime(list.get(i))){
               list.remove(i);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList <Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scn.nextInt());
        }
        solution(list);
        scn.close();
    }
    
}
