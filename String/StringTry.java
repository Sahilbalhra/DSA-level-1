
import java.util.*;
// input s=abcd
//output
// a
// ab    b
// abc   bc   c
// abcd  bcd  cd  d
 
public class StringTry {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str= scn.nextLine();
        for(int i=0;i<str.length()-1;i++){
            for(int j =i+1;j<str.length()+1;j++){
                System.out.println(str.substring(i,j)+" ");
            }
            
        }
        scn.close();

        
    }
    
}
