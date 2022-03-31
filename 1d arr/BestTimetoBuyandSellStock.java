// 121. Best Time to Buy and Sell Stock leetCode
// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.

import java.util.*;
public class BestTimetoBuyandSellStock {
    public static Scanner scn = new Scanner(System.in);
    
    public static void input(int [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
       int min = prices[0];
       for (int i = 1; i < prices.length; i++) {
           if (prices[i] < min) {
               min = prices[i];
           } else if (prices[i] - min > profit){
               profit = prices[i] - min;
           }
       }
       return profit;
       
       
   }
   public static void main(String[] args) {
    int n=scn.nextInt();
    int [] arr=new int[n];
    input(arr);
    System.out.println(maxProfit(arr));
   }
    
}
