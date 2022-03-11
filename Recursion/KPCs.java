
import java.util.ArrayList;
import java.util.Scanner;

// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
// 2. The following list is the key to characters map :
//     0 -> .;
//     1 -> abc
//     2 -> def
//     3 -> ghi
//     4 -> jkl
//     5 -> mno
//     6 -> pqrs
//     7 -> tu
//     8 -> vwx
//     9 -> yz

// Sample Input
// 78

// Sample Output
// [tv, tw, tx, uv, uw, ux]

public class KPCs {
    // all alpha according to the number
    public static String[] codes = { ".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    // getKPC function
    public static ArrayList<String> getKPC(String str){
        if(str.length()==0){
            ArrayList <String> base=new ArrayList<>();
            base.add(" ");
            return base;
        }
         char ch=str.charAt(0);//7 
         String ros=str.substring(1);//8

         ArrayList <String> recAns=getKPC(ros);//vwx
         ArrayList<String>myAns=new ArrayList<>();

        //  int idx=ch-"0";
         String currCode=codes[ch-'0'];//tu

         for(int i=0;i<currCode.length();i++){
             char idxCurrCode=currCode.charAt(i);//t and then u
             for(String val:recAns){
                myAns.add(idxCurrCode+val);
             }
         }

         return myAns;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> ans = getKPC(str);
        System.out.print(ans);
        scn.close();

    }

}
