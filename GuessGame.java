/* The "GuessGame" that uses decision statements
*
* @author  Hussein
* @version 1.0
* @since 2020-11-23
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the standard "GuessGame" program.
*/

final class GuessGame {

    /**
    * Declaring exponent variable.
    */
    public static final int NUMB = 7;
    /**
    * Declaring exponent variable.
    */
    public static final int NUMBB = 6;
    /**
    * Declaring exponent variable.
    */
    public static final String SPACE = "\n";

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
            final Random rand = new Random();
            int counter = 1;
            while (counter < NUMB) {
                counter = counter + 1;
            }
            final int randomNumber = rand.nextInt(counter);

            // creating Scanner
            final Scanner myObj = new Scanner(System.in);
            // while for guess again and types
            int numberOfTries = 0;
            while (true) {
                System.out.print("Guess a number between 1 to 6: ");
                final int userInput = myObj.nextInt();
                numberOfTries = numberOfTries + 1;

                // if statment
                if (userInput == randomNumber) {
                    System.out.print(SPACE + "You are correct!"
                                           + SPACE + "It took you "
                                           + numberOfTries + " tries." + SPACE);
                    break;
                } else if (userInput > NUMBB) {
                    System.out.print("This isn't between 1 to 6."
                                       + "This won't count" + SPACE
                                       + SPACE);
                } else if (userInput < randomNumber) {
                    System.out.print("You guessed too Low!" + SPACE
                                       + "Guess again " + SPACE
                                       + SPACE);
                } else if (userInput > randomNumber) {
                    System.out.print("You guessed too high!" + SPACE
                                       + "Guess again" + SPACE
                                       + SPACE);
                }
            }
        } catch (java.util.InputMismatchException errorCode) {
            // Invalid Input.
            System.out.println("This is not an integer.");
        }
        System.out.println("\nDone.");
    }
}
