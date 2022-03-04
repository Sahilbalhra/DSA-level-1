package Recursion;
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the elements of array from end to beginning each in a separate line.
// Sample Input
// 5
// 3
// 1
// 0
// 7
// 5

import java.util.Scanner;

// Sample Output
// 5
// 7
// 0
// 1
// 3

public class DisplayArrReverse {
    public static Scanner scn =new Scanner(System.in);
    //input arr
    public static void inputArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    } 
    //output Array
    public static void displayArr(int [] arr,int idx){
        if(idx==arr.length){
            return;
        }
        displayArr(arr, idx+1);
        System.out.println(arr[idx]);

    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int [] arr=new int[n];
        inputArr(arr);
        displayArr(arr,0);
        
    }
    
}
