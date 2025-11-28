/* exercise num 2
Write a code reception the size of the square side, calculate its area and show on the screen

Form: area=side X side
 */
package basic.exercice.JavaFundamental;

import java.util.Scanner; // Import scanner tools
import java.text.DecimalFormat; // Import formart tools

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanners input of the code
        DecimalFormat formater = new DecimalFormat("#,##0.00"); // format the results of the code

        // Receptions the length and the width values of the squere.
        double length; // stores the value the squere lenth
        double width; // stores the value the squere width
        System.out.println("--- Calculate of squere area ---"); // title of program

        // retrieve the length value from the user.
        System.out.print("What is the Large Area of your square? ");
        length = input.nextInt();
        // retrieve the width value from the user.
        System.out.print("What is the shot area of your square? ");
        width = input.nextInt();

        // make the calculate the area of square
        double totalArea = (length * width);
        System.out.println("-------------------------------------");
        System.out.print("The total area of your square is " + formater.format(totalArea) );
    }
}
