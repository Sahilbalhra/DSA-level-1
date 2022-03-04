package Recursion;
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the maximum of input. 

// Sample Input
// 6
// 15
// 30
// 40
// 4
// 11
// 9

// Sample Output
// 40
import java.util.Scanner;

public class MaxArr {
    public static Scanner scn =new Scanner(System.in);
    //input arr
    public static void inputArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    } 
    public static int maxOfArray(int []arr, int idx){
        if(idx==arr.length){
            return 0;
        }
        int rec=maxOfArray(arr, idx+1);
        int curr=arr[idx];
        int ans=Math.max(rec, curr);
        return ans;
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int [] arr=new int[n];
        inputArr(arr);
        int max=maxOfArray(arr, 0);
        System.out.println(max);
        
    }
    
}
