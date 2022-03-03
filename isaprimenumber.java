// import java.util.Scanner;
// public class Main{
//     public static void main(String []args){
//         Scanner scn =new Scanner(System.in);
//         int num =scn.nextInt();
//         int factorial=0;
//         for(int i =2;i<num;i++){
//             if(num%i==0){
//                 factorial++;
//             }
//         }
//         if(factorial==1){
//             System.out.println("prime");
//         }else{
//             System.out.println("is not a prime number");
//         }
//     }
// }



// // Second method
// import java.util.Scanner;
// public class Main{
//     public static void main(String []args){
//         Scanner scn =new Scanner(System.in);
//         int num =scn.nextInt();
//         int factorial=0;
//         for(int i =2;i<num;i++){
//             if(num%i==0){
//                 factorial++;
//                 break;
//             }
//         }
//         if(factorial==1){
//             System.out.println("not a prime");
//         }else{
//             System.out.println("prime number");
//         }
//     }
// }

// third number
import java.util.Scanner;
import java.lang.Math;
class isaprimenumber{
    public static void main(String []args){
        Scanner scn =new Scanner(System.in);
        int t=scn.nextInt();
       
        for(int i=0;i<t;i++){
            // System.out.println("you enter number is:"+ t);
             int n=scn.nextInt();
             int factorial=0;
             for(int j=2;j<Math.sqrt(n);j++){
                 if(n%j==0){
                     factorial++;
                     break;
                 }
             }
             if(factorial==1){
                 System.out.println("not a prime number");
                 
             }else{
                 System.out.println("prime");
             }
        }
        scn.close();
    }
}


