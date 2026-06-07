package if_else;

import java.util.Scanner;

public class Profit_Or_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter the Selling price: ");
        int sp = sc.nextInt();
        int profit = sp - cp;
        int profit_percentage = (profit*100)/cp;
        int loss = cp - sp;
        int loss_percentage = (loss*100)/cp;
        if (sp>cp) {
            System.out.println("Profit of " +profit);
            System.out.println("percentage of profit is "+profit_percentage);
        }
        if (sp==cp) {
            System.out.println("No profit and No loss");
        }
        else {
            System.out.println("Loss of " +loss);
            System.out.println("percentage of loss is "+loss_percentage);
        }
    }
}
