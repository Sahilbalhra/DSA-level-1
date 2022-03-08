// 1. You are given a number n, the size of a chess board.
// 2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
// Note - Queens kill at distance in all 8 directions
// 3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

// Sample Input
// 4
// Sample Output
// 0-1, 1-3, 2-0, 3-2, .
// 0-2, 1-0, 2-3, 3-1, .

import java.util.*;
class Nqueen{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] chess = new int[n][n];
        printNQueens(chess, "", 0);
        scn.close();
    }

    public static boolean isSafeToPlace(int [][] chess, int r, int c){
        //1.
        for(int i = r-1, j = c-1; i >= 0 && j >= 0 ; i--, j--){
            if(chess[i][j] == 1)
                return false;
        }
        // 2.
        for(int i = r-1, j = c; i >= 0 ; i--){
            if(chess[i][j] == 1)
                return false;
        }
        //3.
        for(int i = r-1, j = c+1; i >= 0 && j < chess.length ; i--, j++){
            if(chess[i][j] == 1)
                return false;
        }
        return true;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length ){
            System.out.println(qsf + ".");
            return;
        }
        for(int col = 0; col<chess[0].length; col++){
            if(isSafeToPlace(chess, row, col)){
                chess[row][col] = 1;
                printNQueens(chess, qsf + row+"-"+col+", ", row+1);
                chess[row][col] = 0;
            }
        }
    }
}