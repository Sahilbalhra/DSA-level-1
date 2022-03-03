package Pattern;
import java.util.*;
public class pattern6{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int space=n-1;
        int star=1;
       
        for(int i =1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
                space--;
            }
            for(int z=1;z<=star;z++){
                System.out.print("*\t");
                star++;
            }
            System.out.println();
        }
        scn.close();

    }
}