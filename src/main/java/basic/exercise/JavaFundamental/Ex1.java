/* exercise num 1

Description: Write a code reception the name and the year of born for somebody and output in screen
the message: "Hello 'name the person' you are 'X' years old"

 */

package basic.exercise.JavaFundamental;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name; //string for the name th person
        int age; //integers variable byte have 8 bits --> -128 / 127 the basic for memorise the age the person
        
        System.out.println("Whats your name? ");
        name = input.nextLine();
        
        System.out.println("Whats your age? ");
        age = input.nextInt();
        
        System.out.println("Hello " + name +", you are " + age + " years old."); // this is the output of program
    }
}
