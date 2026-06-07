package if_else;

import java.util.Scanner;

public class fourdigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n>999 && n<10000) System.out.println("It is 4 Digit Number.");
        else System.out.println("Not a 4 Digit Number.");
        if (-n>69 || n>69) System.out.println("Magnitude is greater than 69.");
        else if (-n==69 || n==69) System.out.println("Magnitude is Equal to 69.");
        else System.out.println("Mangnitude is less than 69.");
    }
}
