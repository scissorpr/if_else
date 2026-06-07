package if_else;

import java.util.Scanner;

public class sides_of_triangle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter side a: ");
            int a = input.nextInt();
            System.out.print("Enter side b: ");
            int b = input.nextInt();
            System.out.print("Enter side c: ");
            int c = input.nextInt();
            if (a+b>c && b+c>a && a+c>b) System.out.println("Valid Triangle");
            else System.out.println("Invalid Triangle");
        }
    }

