package basic;

import java.util.Scanner; // Import must be at the top of the file.

/*
 * Conditional Structures { if/else and switch }
 *
 * Example of using conditionals: If 5 is greater than 10, do this; otherwise, do that.
 */
public class ConditionalStructures {

    public static void main(String[] args) {
        // Initialize the Scanner once at the beginning of main.
        Scanner leitor = new Scanner(System.in);

        // --- if / else if / else ---
        /*
         * The 'if' statement is a separate structure from 'else'.
         * However, 'else' and 'else if' cannot exist without a preceding 'if'.
         */
        int age1 = 60;
        int age2 = 80;

        if (age1 > age2) { // Read as: "if age1 is greater than age2, execute this block."
            System.out.println("age1 is greater than age2!");

        } else if (age1 < age2) { // An optional block to check another condition.
            System.out.println("age2 is greater than age1!");

        } else { // Read as: "otherwise (if no other condition was true), execute this block."
            System.out.println("age2 is equal to age1!");
        }

        System.out.println("---"); // Separator

        // --- Ternary Operator ---
        // The ternary operator has the same principle as if/else, but simplified into one line.
        // It's best used for a simple if/else check that returns a value.
        int age3 = 60;
        int age4 = 50;

        // Read as: "Is age3 > age4? If true, assign age3 to olderAge. If false, assign age4 to olderAge."
        int olderAge = age3 > age4 ? age3 : age4;

        System.out.println("The older age is: " + olderAge);

        System.out.println("---"); // Separator

        // --- Classic switch-case Statement ---
        // A 'switch' is useful when you have one variable to check against multiple specific values.

        // 'case' is a reserved keyword in Java. You cannot use it as a variable name.
        // Let's rename it to 'menuChoice'.
        int menuChoice = 0;

        System.out.println("Enter 1 for Paulo, 2 for José, or 3 for Joyce:");
        menuChoice = leitor.nextInt();

        // The 'switch' structure begins, "switching" on the value of 'menuChoice'.
        switch (menuChoice) {

            // Each 'case' checks for a specific value.
            case 1: // If menuChoice is 1, enter this block.
                System.out.println("Paulo");
                break; // 'break' is essential to exit the switch. Without it, execution "falls through" to the next case.

            case 2:
                System.out.println("José");
                break;

            case 3:
                System.out.println("Joyce");
                break;

            default: // 'default' runs if no other case matches. It is optional.
                System.out.println("Value not found in the menu");
                // No 'break' is needed here as it's the last block.
        }

        System.out.println("---"); // Separator

        // --- Modern switch Expression (Java 14+) ---
        // This is a newer, cleaner syntax that can return a value directly.
        // We will reuse the 'menuChoice' variable from the previous example.

        System.out.println("Now using a switch expression for the same value (" + menuChoice + "):");

        // The 'switch' is now an "expression" that assigns its result to the 'resultado' variable.
        String resultado = switch (menuChoice) {
            case 1 -> "Paulo"; // The arrow (->) replaces ':' and 'break'.
            case 2 -> "José";
            case 3 -> "Joyce";
            default -> "Value not found in the menu";
        }; // Notice the semicolon (;) here, as it's an assignment statement.

        System.out.println(resultado);

        // Close the scanner at the end of the program
        leitor.close();
    }
    // The main method ends here.
}
// The class ConditionalStructures ends here.