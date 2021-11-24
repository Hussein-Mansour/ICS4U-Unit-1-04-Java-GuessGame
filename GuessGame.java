/* The "GuessGame" that uses decision statements
*
* @author  Hussein
* @version 1.0
* @since 2020-11-23
*/

import java.util.Scanner;
import java.util.Random;

/**
* This is the standard "GuessGame" program.
*/

final class GuessGame {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private GuessGame() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting...
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Checks if there is an Invalid Input.
        try {

            // while loop to generate random number 1-6
            Random rand = new Random();
            int counter = 1;
            while (counter < 7) {
                counter = counter + 1;
                }
            int randomNumber = rand.nextInt(counter);

            // creating Scanner 
            Scanner myObj = new Scanner(System.in);
            // while for guess again and types
            int numberOfTries = 0;
            while (true) {
                System.out.print("Guess a number between 1 to 6: ");
                final int userInput = myObj.nextInt();
                numberOfTries = numberOfTries + 1;

                // if statment                                                      
                if (userInput == randomNumber) { 
                    System.out.print("\n" + "You are correct!" 
                                          + "\n" + "It took you "     
                                          + numberOfTries + " tries.");
                } else if (userInput > 6) {
                    System.out.print("This isn't between 1 to 6." 
                                       + "This won't count" + "\n"
                                       + "\n");
                } else if (userInput < randomNumber) { 
                    System.out.print("You guessed too Low!" + "\n" 
                                       + "Guess again" + "\n"
                                       + "\n"); 
                } else if (userInput > randomNumber) {
                    System.out.print( "You guessed too high!" + "\n" 
                                       + "Guess again" + "\n"
                                       + "\n");
                }

                // break
                if (randomNumber == userInput) {
                    break;
                }
            }
        } catch (java.util.InputMismatchException errorCode) { 
            // Invalid Input.
            System.out.println("Invalid Input.");
        }
        System.out.println("\nDone.");
    }
}
