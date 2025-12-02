/* excercise num 8
Write a program where the user inputs an initial number. Then, the user will input other numbers. The program should
continue running until the input number divided by the first number has a remainder different from 0. Numbers smaller
than the first number must be ignored.
 */

package basic.exercise.JavaControlStrutures;
import java.util.Scanner;


public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1; // stores the value the inital number
        int num2; // stores the value divided by num1

        // input first number
        System.out.println("Input the first number (The Divider):");
        num1 = sc.nextInt();

        // while(true) is for create a loop by run for breack
        while (true) {
            System.out.println("Input the second number: ");
            num2 = sc.nextInt();
            // rule 1: Ignore smaller number
            if (num2 < num1) {
                System.out.println("Number ignored (smaller than initial). Try again.");
                //  'continue' ignore all after and return to initial while
                continue;
            }

            // rule 2: for stop
            // if result is diferent (!=) by 0, stop the game.
            if (num2 % num1 != 0) {
                System.out.println("Stop! " + num2 + " is not a multiple of " + num1);
                System.out.println("Remainder: " + (num2 % num1));
                // the script 'break' stop the loop and out.
                break;
            }

            // if find were, is because is multiple (result 0)
            System.out.println("Good! " + num2 + " divided by " + num1 + " is exact. Continue...");

        }

        System.out.println("----------------- Program Finished -----------------");
        sc.close(); // Good action: closer the scanner in the end.

    }

}