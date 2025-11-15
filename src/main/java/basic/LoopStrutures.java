package basic;

/*
 * Repetition structures (loops) execute code repeatedly until a condition is met.
 * If there is no stop condition, the program runs indefinitely (an infinite loop), which is a bug.
 * The structures we will look at are: do/while, while, and for.
 */
public class LoopStrutures {
    public static void main(String[] args) {

        // --- DO/WHILE ---
        /*
         * The do/while loop is guaranteed to execute AT LEAST ONCE.
         * It runs the code block *first*, and *then* checks the condition.
         */
        int contador1 = 0; // Initializing the variable to 0 to ensure this start value.

        do {
            System.out.println("do/while: " + contador1); // Prints the counter.

            contador1++; // Incrementing to get closer to the stop condition.

        } while (contador1 < 10); // Read as: "do this block, and then repeat as long as counter1 is less than 10."

        // The stop condition is met when counter1 equals or exceeds 10.

        System.out.println("---"); // Separator

        // --- WHILE ---
        /*
         * The 'while' loop checks the condition *before* executing the block.
         * If the condition is false from the start, the block will never run.
         */
        int contador = 0; // Initializing the variable to 0.

        while (contador < 10) {
            System.out.println("while: " + contador); // Prints the counter.

            contador++; // Incrementing to reach the stop condition.

        } // Read as: "While the counter is less than 10, run the block. When it reaches 10, stop."

        // The stop condition is met when counter equals or exceeds 10.

        System.out.println("---"); // Separator

        // --- FOR ---
        /*
         * The 'for' loop is the most common loop. It's perfect when you know
         * exactly how many times you want to iterate.
         * It combines initialization, condition, and increment all in one line.
         */

        // (1) int i = 0: Initialize a counter 'i' to 0. This runs once.
        // (2) i < 10: The stop condition. This is checked *before* each iteration.
        // (3) i++: The increment. This runs *after* each iteration.
        for (int i = 0; i < 10; i++) {

            System.out.println("for: " + i); // Prints the counter 'i' until the condition is met.
        }
    }
}