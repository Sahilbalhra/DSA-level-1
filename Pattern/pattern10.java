package Pattern;
import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int outerspace = n / 2;
        int innerSpace =-1;
        for (int i = 1; i <= n; i++) {
            // space
                for (int j = 1; j <= outerspace; j++) {
                    System.out.print("\t");

                }
                //star
                System.out.print("*\t");
                //space
                for(int k=1;k<=innerSpace;k++){
                    System.out.print("\t");

                }
                //star
                if(i>1 && i<n){
                    System.out.print("*\t");

                }
                if(i<=n/2){
                    outerspace--;
                    innerSpace +=2;
                }else{
                    outerspace++;
                    innerSpace -=2;

                }

            System.out.println();
        }
        scn.close();
    }
}
