import java.util.*;
public class fibanacci {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int num=0;
        int num1=1;
        for(int i=0;i<n;i++){
            System.out.println(num);
            int num2=num+num1;
            num=num1;
            num1=num2;
        }
        scn.close();

    }
    
}
