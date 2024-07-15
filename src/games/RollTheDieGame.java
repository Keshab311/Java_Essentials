package games;

import java.util.Random;
import java.util.Scanner;

/*
 * ROLL A DIE GAME
 * The user needs to mention the space where it is (it can be between 1 and 20 ONLY)
 * The die is rolled 5 times and the space is decided based on the throw!
 *  If the result space is equal to 20, you win!!
 */

public class RollTheDieGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //taking user space as input.
        System.out.println("Let's play roll a die game!!");
        System.out.println("You need to specify which space you are in(1-20)");
        System.out.println("if you get to exactly space 20 on five die rolls, you win!");
        System.out.println("Enter the space number now!!");
        int space = scanner.nextInt();

        //checking validity of input.
        if(space < 0 || space>20)
        {
            System.out.println("Invalid input! please try again!!");
            System.exit(0);
        }
        scanner.close();

        // space computation starts here.
        Random random = new Random(); // Random is imported to reflect the randomness of the die throw.
        for(int i=0;i<5;i++) {
            int die = random.nextInt(6) + 1;
            space = space + die; // the space value is computed.
            if ((space) == 20) {
                System.out.println("Roll #" + (i+1) + ":" + " " + "You've rolled a " + die + "." + " " + "You're on space 20. Congrats, you win!");
            }
            else{
                System.out.println("Roll #"+ (i+1)+":"+" "+"You've rolled a "+die+". You are now on space "+space+" "+"and have "+(20-space)+" "+"more to go.");

            }
        }
        System.out.println("Sorry! You are at space "+space+"."+" "+"Better luck next time!!");
    }
}
