import java.util.*;

public class inputAndOutput {
    //Scanner classs
    public static Scanner scn =new Scanner(System.in);
    //input class
    public static void input(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
    }

    //output
    public static void output(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m= scn.nextInt();
        int [][]arr= new int[n][m];
        input(arr);
        output(arr);

    }

}
