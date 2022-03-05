import java.util.ArrayList;
import java.util.Scanner;

// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Sample Input
// 3

// Sample Output
// [111, 12, 21, 3]

class GetStairPath {
    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            //ground p ho hilo hi mat
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if(n<0){
            ArrayList<String> base = new ArrayList<>();
            return base;

        }
        ArrayList<String> myans = new ArrayList<>();
        for (int jump = 1; jump <= n; jump++) {
            if (n - jump > 0) {
                ArrayList<String> recAns = getStairPaths(n - jump);
                for (String s : recAns) {
                    myans.add(jump + s);
                }

            }

        }
        return myans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
        scn.close();
    }
}