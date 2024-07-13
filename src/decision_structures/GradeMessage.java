package decision_structures;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

public class GradeMessage {
    public static void main(String[] args){
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        //switch expression(traditional switch already known)
        String message = switch (grade) {
            case "A+","A" -> {
                System.out.println("Your remarks based on grade :"+grade);
                yield message = "Excellent job";
            }
            case "B" -> {
                System.out.println("Your remarks based on grade :"+grade);
                yield message = "Great job!";
            }
            case "C" -> {
                System.out.println("Your remarks based on grade :"+grade);
                yield message = "Good job!";
            }
            case "D" -> {
                System.out.println("Your remarks based on grade :"+grade);
                yield message = "You need to work a bit harder!";
            }
            case "F" -> {
                System.out.println("Your remarks based on grade :"+grade);
                yield message = "Uh oh! You failed!";
            }
            default -> "Error. Invalid grade!";
        };
        System.out.println("Remarks :"+message);
    }
}
