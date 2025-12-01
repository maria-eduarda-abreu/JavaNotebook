//Write a code reception one name and the age of two peoples and output the age ddifference between them

package basic.exercise.JavaFundamental;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// scanner the inputs

        String name1; //stores the value name of person 1
        String name2; //stores the value name of person 2

        System.out.print("Enter your name person 1: ");
        name1 = input.nextLine();

        System.out.print("Enter your name Person 2: ");
        name2 = input.nextLine();

        int age1; //stores the value age of person 1
        int age2; //stores the value age of person 2

        System.out.print("Enter your age person 1: ");
        age1 = input.nextInt();

        System.out.print("Enter your age person 2: ");
        age2 = input.nextInt();

        // caculator diference of ages
        int calculate = (age1 - age2);//stores the value of diference of ages person 1 and 2
        System.out.println("The age diference of " + name1 + " age and " + name2 + " age is " + Math.abs(calculate) + " years");
    }
}
