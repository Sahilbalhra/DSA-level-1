// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Sample Input
// 2
// 2

// Sample Output
// [h1v1, v1h1, d1]
import java.util.*;

public class GetMazePathsWithJump {
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePathsWithJump(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans = new ArrayList<>();
        // horizontal
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePathsWithJump(sr, sc + ms, dr, dc);
            for (String x : hpaths) {
                ans.add("h" + ms + x);
            }
        }
        // vertical
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getMazePathsWithJump(sr + ms, sc, dr, dc);
            for (String x : vpaths) {
                ans.add("v" + ms + x);
            }
        }
        // Diagonol
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            ArrayList<String> dpaths = getMazePathsWithJump(sr + ms, sc + ms, dr, dc);
            for (String x : dpaths) {
                ans.add("d" + ms + x);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> myAns = getMazePathsWithJump(1, 1, n, m);
        System.out.println(myAns);
        scn.close();

    }

}
