import java.util.*;
public class brokeneconomy {
    public static Scanner scn = new Scanner(System.in);
    
    public static void input(int [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    
    public static void brokenEconomy(int [] arr,int data){
        int lo=0;
        int hi=arr.length-1;
        int floor=0;
        int ceil=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
         if(data<arr[mid]){
                hi=mid-1;
                ceil=arr[mid];
            }else if(data>arr[mid]){
                lo=mid+1;
                floor=arr[mid];
            }else{
                ceil=arr[mid];
                floor=arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }

  public static void main(String[] args) throws Exception {
    // write your code here
    int n=scn.nextInt();
    int [] arr=new int[n];
    input(arr);
    int find =scn.nextInt();
    brokenEconomy(arr,find);
  }
    
}
