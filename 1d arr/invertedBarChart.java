import java.util.*;

public class invertedBarChart {
  public static Scanner scn = new Scanner(System.in);

  //input
  public static void input(int[]arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
  }
  //maximum depth of chart
  public static int maximum(int [] arr) {
    int max = -1;
    for (int ele : arr) {
      max = Math.max(ele, max);
    }
    return max;
  }
  //invert of bar Chart
  public static void invertBar(int[]arr) {
    int max = maximum(arr);
    for (int i = 0; i < max; i++) {
     for(int ele :arr){
         if(ele>i){
             System.out.print("*\t");
         }else{
             System.out.print("\t");
         }
         
     }
     System.out.println();
    }
  }

  public static void main(String[] args) throws Exception {
    // write your code here
    int n = scn.nextInt();
    int [] arr = new int [n];
    input(arr);
    invertBar(arr);
  }

}