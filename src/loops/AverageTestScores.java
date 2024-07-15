package loops;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores.
 */
public class AverageTestScores {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        //Process all students
        for(int i=0;i<numberOfStudents;i++)
        {
            double total = 0.0d;
             //Process a student's test scores
            for(int j=0;j<numberOfTests;j++)
            {
                System.out.println("Enter the score for test #"+ (j+1));
                double score = scanner.nextDouble();
                total+=score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student # "+(i+1)+" is "+average);
        }

        scanner.close();

    }
}
