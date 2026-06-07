package if_else;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if (number%2 == 0) {
            System.out.println("The given number is even number.");
        }

        else {
            System.out.println("The given number is odd number.");
        }
        // if ( number%5 == 0) {
        //     System.out.println("The given number is divisile by 5.");
        // }
        // else {
        //     System.out.println("The given number is not divisble by 5.");
        // }

    }
}
