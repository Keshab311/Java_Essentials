package decision_structures;

import java.util.Scanner;

public class QuotaChecker {
    public static void main(String[] args){

        //Initialize known values
        int quota = 20;

        //Get values for the unknown
        System.out.println("How many sales did you make this week?");
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        sc.close();

        //Quick detour for the bonus earners
        if(sales>=quota){
            System.out.println("Congrats! You've met your quota.");
        }
        else{
            System.out.println("Oops! You are running short of quota by "+(quota-sales)+" "+"sales.");
        }
    }
}
