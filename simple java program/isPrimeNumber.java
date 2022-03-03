import java.util.*;
public class isPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
         boolean isPrime =true;
         for(int i =2;i<n;i++){
             if(n%i==0){
                 isPrime=false;
             }
         }
         if(isPrime==true){
             System.out.println("number is Prime");
         }else{
            System.out.println("number is not a Prime");

         }

        scn.close();
    }
    
}
