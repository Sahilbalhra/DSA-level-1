import java.util.*;

public class searchInShortedArray {
    public static   Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
      
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int x = scn.nextInt(); // data
        int i = 0;
        int j = n - 1;

        while (j >= 0 && i < n) {
            int me = arr[i][j];
            if (me == x) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (me > x) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("Not Found");
 
    }

}
