/**
 * Project 1 for CS 1180.
 * This program demonstrates the use of the NetBeans IDE.
 * The program will prompt for input, do one numerical manipulation, and output results.
 */
package project1;

/**
 * @author Super Sir Simone Royal
 * CS-1180L-05
 * Instructor: Everybody
 * Project 1: Arithmetic Quiz
 */
import java.util.Scanner;

public class Project1 {

    /**
     * Displays all the types of options for the user's math quiz.
     */
    static void displayMenu() {
        System.out.println("\nPlease choose one of the following options for your math quiz:\n"
                          + "1. Addition with numbers 1-10\n"
                          + "2. Addition with numbers 1-100\n"
                          + "3. Subtraction with numbers 1-10\n"
                          + "4. Subtraction with numbers 1-100\n"
                          + "5. Multiplication with numbers 1-10\n"
                          + "6. Exit the program\n");
    }

    /**
     * Prompts the user to enter a value to a generated problem of their type if
     * the users answers correct, then it adds to the correct total, otherwise
     * it outputs the correct answer.
     *
     * @param lowerBound - the lower bound of randomly generated numbers.
     * @param upperBound - the upper bound of randomly generated numbers.
     * @param operator - the operation the user selected. (e.g. +/-/*)
     * @return the amount of correct questions answered by the user.
     */
    static int quizEngine(int lowerBound, int upperBound, char operator) {
        int amountCorrect = 0;
        Scanner input = new Scanner(System.in);
        // Output 5 questions to the user that depends on the parameters passed.
        for (int i = 0; i < 5; i++) {
            int number_1 = (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
            int number_2 = (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
            int correctAnswer = 0;
            switch (operator) {
                case '+':
                    correctAnswer = number_1 + number_2;
                    break;
                case '-':
                    correctAnswer = number_1 - number_2;
                    break;
                case '*':
                    correctAnswer = number_1 * number_2;
                    break;
            }
            System.out.printf("\nEnter the answer to the following problem: %d %c %d\n", number_1, operator, number_2);
	    // Take in user input and validate it against the correct answer.
            int userAnswer = input.nextInt();
            if (userAnswer == correctAnswer) {
                amountCorrect += 1;
                System.out.println("That is the correct answer!");
            } else {
                System.out.printf("Sorry, that is incorrect. The correct answer is %d\n", correctAnswer);
            }
        }
        return amountCorrect;
    }

    /**
     * Prompts user to select the type of problem they wish to practice in the
     * quiz. Once the user quiz the program it displays the statistics of how
     * well the user did.
     *
     * @param args - arguments passed via the command line.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the [redacted] school of Math!");
        int amountCorrect = 0, problemsAttempted = 0;
        // Loop that passes the proper args to quizEngine based on the user.
        loop:
        while (true) {
	    // Call displayMenu to display options.
            displayMenu();
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    problemsAttempted += 5;
                    amountCorrect += quizEngine(1, 10, '+');
                    break;
                case 2:
                    problemsAttempted += 5;
                    amountCorrect += quizEngine(1, 100, '+');
                    break;
                case 3:
                    problemsAttempted += 5;
                    amountCorrect += quizEngine(1, 10, '-');
                    break;
                case 4:
                    problemsAttempted += 5;
                    amountCorrect += quizEngine(1, 100, '-');
                    break;
                case 5:
                    problemsAttempted += 5;
                    amountCorrect += quizEngine(1, 10, '*');
                    break;
                case 6:
                    break loop;
                default:
                    System.out.println("Valid choices are 1-6; please re-enter.");
            }
        }
	// Statistics/score handling, prevents IEEE NAN if div by 0.
        float percentage = 0;
        if (problemsAttempted != 0) {
            percentage = (amountCorrect / (float) problemsAttempted) * 100;
        }
        System.out.printf("\nYou got %d problems correct out of %d problems attempted. That is %.2f percent correct. Goodbye!\n", amountCorrect, problemsAttempted, percentage);
    }
}
