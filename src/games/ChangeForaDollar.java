package games;

import java.util.Scanner;

public class ChangeForaDollar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 'Change for a Dollar'! Your goal is to enter enough change to make exactly $1.00");

        //Accept input values
        System.out.println("Enter your number of pennies:");
        int pennies = scanner.nextInt();
        System.out.println("Enter your number of nickels:");
        int nickels = scanner.nextInt();
        System.out.println("Enter your number of dimes:");
        int dimes = scanner.nextInt();
        System.out.println("Enter your number of quarters:");
        int quarters = scanner.nextInt();
        scanner.close();

        double totalAmount = 0.0d;
        totalAmount = (double) (pennies + (5 * nickels) + (20 * dimes) + (25 * quarters)) /100;
        if(totalAmount == 1.00)
        {
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
        else if(totalAmount > 1.00)
            System.out.println("Uh oh! Seems like you went over $1.00 by $" + String.format("%.2f", (totalAmount - 1.00)));
        else
            System.out.println("Uh Oh! Seems like you fell short of $1.00 by $" + String.format("%.2f", (1.00 - totalAmount)));
    }
}
