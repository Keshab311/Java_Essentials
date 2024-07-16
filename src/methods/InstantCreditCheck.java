package methods;

import java.util.Scanner;

/*
 * PASSING ARGUMENTS TO METHODS
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

public class InstantCreditCheck {
    public static void main(String[] args){

        //get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        //checking input validity
        if(salary < 0 || creditScore < 0 ){
            System.out.println("Invalid input!! please enter again!");
            System.exit(0);
        }

        //checking if the user is qualified
        boolean eligible;
        eligible = isEligible(salary,creditScore); // passing values to accept boolean response from the method.
        if(eligible){
            System.out.println("Congrats! you are eligible for a loan!!");
        }
        else{
            System.out.println("Sorry! you are not eligible for the loan!!");
        }
    }
    public static boolean isEligible(double salary,int creditScore){
        return salary > 25000 && creditScore > 700; //return true if salary>25000 and creditScore>700, else false.
    }
}
