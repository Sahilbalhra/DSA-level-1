import java.util.Scanner;
public class GreetUser{
    public static void main(String[] args) {
        System.out.println("Enter your name Plz:");
        Scanner scn =new Scanner(System.in);
        String name=scn.nextLine();
        System.out.println("Hello "+name);

        scn.close();
    }
}