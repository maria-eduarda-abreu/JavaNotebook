/*
Write a code reception the base and height of the rectangle, calculete your área and show in the screen

formula: area=base X height
 */
package basic.exercice.JavaFundamental;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base; // stores the value base of rectangle
        double height; // stores the value height of rectangle

        // retrieve the base value from the user.
        System.out.println("What is the base of your rectangle?");
        base = input.nextInt();

        // retrieve the height value from the user.
        System.out.println("What is the height of your rectangle?");
        height = input.nextInt();

        //caculete rectangle
        double totalArea = (base * height);
        System.out.println("The total area of your rectangle is " + totalArea);
    }
}
