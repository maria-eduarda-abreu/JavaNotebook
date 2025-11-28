/* exercise num 1

Description: Write a code reception the name and the year of born for somebody and output in screen
the message: "Hello 'name the person' you are 'X' years old"

 */

package basic.exercice.JavaFundamental;

public class Ex1 {
    public static void main(String[] args) {

        String name = "Doda"; //string for the name th person
        byte age = 20; //integers variable byte have 8 bits --> -128 / 127 the basic for memorise the age the person
        
        System.out.println("Hello " + name +", you are " + age + " years old."); // this is the output of program
    }
}
