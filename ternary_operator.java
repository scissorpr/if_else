package if_else;

import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println((n%2==0) ? "Even" : "Odd");  //1st use case

        // Ternary In Variable


//        (a>b) ? ((a>c)?a:c ): ((b>c)?b:c); //Greatest of three number ka ternary operation se code
    }
}
