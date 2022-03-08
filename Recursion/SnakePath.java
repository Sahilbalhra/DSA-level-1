// 1.Take as input N, a number. N is the size of a snakes and ladder board (without
// any snakes and ladders).
// 2.Take as input M, a number. M is the number of faces of the dice.

// a. Write a recursive function which returns the count of different ways the
// board can be travelled using the dice. Print the value returned.

// b. Write a recursive function which returns an ArrayList of dice values for all
// valid paths across the board. Print the value returned.

// c. Write a recursive function which prints dice-values for all valid paths across
// the board (void is the return type for function).

// Sample Input
// 5
// 6

// Sample Output 
// 16
// [11111, 1112, 1121, 113, 1211, 122, 131, 14, 2111, 212, 221, 23, 311, 32, 41, 5]
// 11111
// 1112
// 1121
// 113
// 1211
// 122
// 131
// 14
// 2111
// 212
// 221
// 23
// 311
// 32
// 41
// 5

import java.util.*;
public class SnakePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt(); // board length
        int M = scn.nextInt(); // Number of faces of dice

        System.out.println(count(N,M));
        
        System.out.println(paths(N, M));
        print(N,M);
        scn.close();
    }

    public static int count(int N,int M){
        if(N==0){
            return 1;
        }
        int num=0;
         for(int jump=1;jump<=M&& N-jump>=0;jump++){
             num+=count(N-jump,M);
         }
        return num;
    }
    
    public static void printHelper(int N,int M,String str){
        if(N==0){
            System.out.println(str);
            return;
        }
         
        for(int jump=1;jump<=M&& N-jump>=0;jump++){
            printHelper(N-jump,M,str+jump);
         }
        
        
    }

    public static void print(int N,int M){
        printHelper(N,M,"");
 
    }

    public static ArrayList<String> paths(int N,int M){
        if(N==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
         ArrayList<String>myAns=new ArrayList<>();
        
        for(int jump=1;jump<=M&& N-jump>=0;jump++){
            
              ArrayList<String>recAns=paths(N-jump,M);
               for(String x:recAns){
                   myAns.add(jump+x);
               }  
         }
        
        return myAns;
    }
}
