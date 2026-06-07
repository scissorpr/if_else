package if_else;

import java.util.Scanner;

public class else_ladder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        if (n%5==0 && n%3==0) System.out.println("Divisible by both 3 & 5.");
        else if (n%5==0) System.out.println("Divisible by 5 only. ");
        else if (n%3==0) System.out.println("Divisible by 3 only.");
        else System.out.println("Nor divisible by 3 & 5.");

        // Comparison of area of rectangle and perimeter of Rectangle

        System.out.print("Enter the length: ");
        int l = input.nextInt();
        System.out.print("Enter the breadth: ");
        int b = input.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);
        if (area>perimeter) System.out.println("Arae is greater than Perimeter");
        else System.out.println("Perimeter is greater than Area");

        // quadrant wala question

        System.out.print("Enter the value of x: ");
        int x = input.nextInt();
        System.out.print("Enter the value of y: ");
        int y = input.nextInt();
        if (x==0 && y==0){
            System.out.println("It lies at origin.");

        } else if (x==0 && y!=0) {
            System.out.println("It lies at y-axis.");

        } else if (x!=0 && y==0) {
            System.out.println("It lies at x-axis.");

        } else if (x>0 && y>0) {
            System.out.println("It lies at 1st quadrant.");

        } else if (x<0 && y>0) {
            System.out.println("It lies in 2nd quadrant.");

        } else if (x<0 && y<0) {
            System.out.println("It lies in 3rd quadrant.");

        } else if (x>0 && y<0) {
            System.out.println("It lies in 4th quadrant.");

        }


    }
}
