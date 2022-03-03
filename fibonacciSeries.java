// // import java.util.Scanner;

// public class fibonacciSeries {

//     public static void main(String[] args) {
//         // System.out.println("Enter the number for the fibonacci Series");
//         // Scanner scn =new Scanner(System.in);
//         // int num=scn.nextInt();
//         // if(num==0){
//         // System.out.println(0);

//         // }
//         // if(num==1){
//         // System.out.println(1);
//         // }
//         int n = 10, firstTerm = 0, secondTerm = 1;
//         System.out.println("Fibonacci Series till " + n + " terms:");

//         for (int i = 1; i <= n; ++i) {
//             System.out.print(firstTerm + ", ");

//             // compute the next term
//             int nextTerm = firstTerm + secondTerm;
//             firstTerm = secondTerm;
//             secondTerm = nextTerm;

//         }

//     }
// }



// import java.util.Scanner;
// public class fibonacciSeries {

//     static void fibonacci(int n){
//         int num =0,num1=1,num2;
//         int counter=0;
//         while(counter<=n){
//             System.out.println(num);
//             num2=num+num1;
//             num=num1;
//             num1=num2;
//             counter++;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter the number upto till the number");
//         Scanner scn =new Scanner(System.in);
//         int n =scn.nextInt();
//         fibonacci(n);
//     }
// }

import java.util.Scanner;
public class fibonacciSeries{

    static int fib(int n)
    {
  
        // Declare an array to store
        // Fibonacci numbers.
        // 1 extra to handle case, n = 0
        int f[] = new int[n + 2];
  
        int i;
  
        // 0th and 1st number of
        // the series are 0 and 1
        f[0] = 0;
        f[1] = 1;
  
        for (i = 2; i <= n; i++) {
  
            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }
  
        // Nth Fibonacci Number
        return f[n];
    }
    public static void main(String[] args) {
    
        System.out.println("Enter the number upto till the number");
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(fib(n)+' ');
        }
        scn.close();

    }
}