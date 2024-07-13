package decision_structures;

import java.util.Scanner;
/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */
public class TestResults {
    public static void main(String[] args){

        //Get the test score
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score!");
        double score = scanner.nextDouble();
        scanner.close();

        //Determine the letter grade
        char grade;
        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        //Displaying the result
        System.out.println("Based on your score, your grade is :"+grade);
    }
}
