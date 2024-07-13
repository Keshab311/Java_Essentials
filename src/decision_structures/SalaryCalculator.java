package decision_structures;

import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("Employee's salary pay is = $"+salary);
    }
}
