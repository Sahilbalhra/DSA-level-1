import java.util.ArrayList;
import java.util.Scanner;

// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
// 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Sample Input
// 3
// 3

// Sample Output
// [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]

public class GetMazePaths {
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
        // horizontal path
        if (sc < dc) {

            hPaths = getMazePaths(sr, sc + 1, dr, dc);
        }
        // vertical Path
        if (sr < dr) {

            vPaths = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> ans = new ArrayList<>();
        for (String s : hPaths) {
            ans.add("h" + s);
        }
        for (String s : vPaths) {
            ans.add("v" + s);
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> myAns = getMazePaths(1, 1, n, m);
        System.out.println(myAns);
        scn.close();

    }

}
