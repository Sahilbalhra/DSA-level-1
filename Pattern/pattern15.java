import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int space=n/2;
        int star=1;
        int val =1;
        for(int i=1;i<=n;i++){
            //space
            
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            //star
            int cval=val;
            
            for(int j=1;j<=star;j++){
                System.out.print(cval+"\t");
                if(j<=star/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            
            if(i<=n/2){
                space--;
                star+=2;
                val++;
            }else{
                space++;
                star-=2;
                val--;
            }
            System.out.println();
        }
        scn.close();
    }
    
}
