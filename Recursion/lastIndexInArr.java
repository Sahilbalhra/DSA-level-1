package Recursion;
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number x. 
// 4. You are required to find the last index at which x occurs in array a.
// 5. If x exists in array, print the last index where it is found otherwise print -1.

// Sample Input
// 6
// 15
// 11
// 40
// 4
// 4
// 9
// 4

// Sample Output
// 4

import java.util.Scanner;
public class lastIndexInArr {
    public static Scanner scn = new Scanner(System.in);

    // input arr
    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    public static int lastIndex(int[] arr, int x, int idx) {
        if (idx == 0) {
            if(arr[idx]==x){
                return idx;
            }
            return -1;
        }

        if (arr[idx] == x) {
           return idx;
        }
       return lastIndex(arr, x, idx -1); 
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        inputArr(arr);
        int find = scn.nextInt();
        int ans =lastIndex(arr, find, n-1);
        System.out.println(ans);
        
    }
    
}
