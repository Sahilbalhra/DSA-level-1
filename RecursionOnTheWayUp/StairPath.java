// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Sample Input
// 3

// Sample Output
// 111
// 12
// 21
// 3

import java.util.*;
public class StairPath {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printStairPaths(n,"");
        scn.close();

    }

    public static void printStairPaths(int n, String path) {
        if(n==0){
            System.out.println(path);
            return;
        }

        for(int jump=1;jump<=3;jump++){
            if(n-jump>=0)
            printStairPaths(n-jump,path+jump);
        }
    }

    
}
