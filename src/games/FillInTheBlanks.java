package games;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's create a story!");

        System.out.println("Enter the name of the season:");
        String season = sc.next();

        System.out.println("Enter the number of cups:");
        int cups = sc.nextInt();

        System.out.println("Enter a suitable adjective of your choice:");
        String adjective = sc.next();

        sc.close();

        System.out.println("On a "+adjective+" "+season+" "+"day, I drink a minimum of "+cups+" "+"cups of coffee.");
    }
}
