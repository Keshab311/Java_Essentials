package methods;

import java.util.Scanner;

/*
 * OUR FIRST USER-DEFINED METHOD
 * Write a method that greets a user by name.
 */

public class Greetings {
    public static void main(String[] args){
        greetUser();

    }

    public static void greetUser(){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        System.out.println("Hi there, "+name);
    }
}
