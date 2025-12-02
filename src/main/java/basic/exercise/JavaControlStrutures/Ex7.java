/*
Write a code that prompts the user to enter a first number, a second number greater than the first, and choose between
even and odd numbers. The code should then display all even or odd numbers (according to the initial selection) within
the entered range, including the entered numbers, in descending order.
 */
package basic.exercise.JavaControlStrutures;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //stores input numbers user
        int num1;
        int num2;
        // stores the option user (ODD or even)
        int ODDorEVEN;
        // inputs user num position 1
        System.out.println("Choose a number for position 1? ");
        num1 = input.nextInt();
        // inputs user num position 2
        System.out.println("OBS: The second number must be grater than number position 1");
        System.out.println("Choose a number for position 2? ");
        num2 = input.nextInt();
        //input option odd or even
        System.out.println("Do you want: (0)- ODD or (1) - EVEN? (0/1)  ");
        ODDorEVEN = input.nextInt();

        // control strutures
        for(int i = num2; i >= num1; i--){ // checkout if number(i) is odd or even
            if(ODDorEVEN == 1){ // for odd
                if(i % 2 == 1){
                    System.out.println(i);
                }
            } else { // for even
                if(i % 2 == 0){
                    System.out.println(i);
                }
                
            }
        }



    }
}
