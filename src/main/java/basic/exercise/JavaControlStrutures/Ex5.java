/* Exercise num 6
Write a code for the user input one number and generate the math table from 1 to 10 from this number;
 */

package basic.exercise.JavaControlStrutures;
import java.util.Scanner;

public record Ex5() {
    public static   void main(String args[]) {
        Scanner input = new Scanner(System.in); // scanner the inputs

        int numUser; // variable stores the input number user
        System.out.println("What number do you want know the math table? ");
        numUser = input.nextInt();

        //format txt for the output head
        System.out.println("----------------------------");
        System.out.println("The math table number "+ numUser + " is ");
        System.out.println("----------------------------");

        // loop struture for build the math table of number user
        for (int i = 0; i < 11; i++) {
            System.out.println(numUser + " * " + i + " = " + (numUser * i)); // formatted output for math table
        }

    }
}