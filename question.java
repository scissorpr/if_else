package if_else;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = sc.nextDouble();
        int x = (int) n;
        if (n-x >0) System.out.println("Not an integer.");     //OR if(n-x==0)
        else System.out.println("An integer.");
    }
}
