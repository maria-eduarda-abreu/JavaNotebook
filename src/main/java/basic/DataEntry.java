package basic;

/*
 * To read data entry, we need to import one class, so in the first line of the code we will use:
 * import java.util.Scanner; - This class will allow us to create an object that receives user data.
 */
import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console (System.in)
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = input.nextLine(); // Reads a full line of text

        System.out.println("Enter Last Name:");
        String lastName = input.nextLine(); // Reads a full line of text

        System.out.println("Enter Age:");
        int age = input.nextInt(); // Reads only the next integer

        System.out.println("Enter your kg");
        float kg = input.nextFloat(); // Reads only the next float

        System.out.println("First name = " + firstName + " Last Name = " + lastName + " Age = " + age + " kg = " + kg);

        // It's good practice to close the scanner when you are done with it
        // to prevent resource leaks.
        input.close();
    }
}