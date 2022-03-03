package Pattern;
import java.util.*;
public class patter4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space=0;
        int star=5;
        for(int i=1;i<=n;i++){
            //space
            for(int j=0;j<space;j++){
                System.out.print("\t");
            }
            //star
            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println();
        }
        scn.close();
        
    }
    
}
