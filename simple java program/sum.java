import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = scn.nextInt();
        System.out.println("Enter the 2nd number");
        int num3 = scn.nextInt();

        System.out.println("Sum of three number will be " + (num1 + num2 + num3));

        scn.close();

    }

}
