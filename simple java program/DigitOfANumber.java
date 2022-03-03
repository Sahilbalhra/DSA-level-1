import java.util.*;
public class DigitOfANumber {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int num =scn.nextInt();
        int pow=1;
        int temp=num;
        while(temp!=0){
            temp=temp/10;
            pow=pow*10;
        }
        pow=pow/10;
        temp=num;
        while(pow!=0){
           int  digit=temp/pow;
            System.out.println(digit);
            temp=temp%pow;
            pow=pow/10;

        }
        scn.close();
        
    }
    
}
