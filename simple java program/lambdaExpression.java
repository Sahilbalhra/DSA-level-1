import java.util.*;

public class lambdaExpression {
    public static void main(String[] args) {

        // String str []="bob and trim like dogs".split(" ");
        // String s="";
        // for(int j=str.length-1;j>=0;j--){
        // s=s+str[j]+" ";

        // }
        // System.out.println(s);

        // int [] arr = {1,6,3,6,9,3,7};
        int[][] arr = { { 1, 4 },
                { 5, 7 },
                { 3, 12 },
                { 18, 2 },
                { 6, 10 } };

        Arrays.sort(arr, (a, b) -> {
            return a[1] - b[1];
        });
        for (int[] d : arr) {
            System.out.println(d[0] + " " + d[1]);
        }

    }

}
