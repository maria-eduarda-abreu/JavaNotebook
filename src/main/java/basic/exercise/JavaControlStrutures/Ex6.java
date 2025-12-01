/*
Write a code where the user enters their height and weight, their BMI is calculated (BMI = weight / (height * height)),
and a message is displayed according to the result:

If it is less than or equal to 18.5 "Underweight";

If it is between 18.6 and 24.9 "Ideal weight";

If it is between 25.0 and 29.9 "Slightly overweight";

If it is between 30.0 and 34.9 "Grade I Obesity";

If it is between 35.0 and 39.9 "Grade II (Severe) Obesity";

If it is greater than or equal to 40.0 "Grade III (Morbid) Obesity";bida)";
 */

package basic.exercise.JavaControlStrutures;
import java.util.Scanner;

public class Ex6 {
    private static Scanner input;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double height;
        double weight;

        System.out.println("--------------------------------------");
        System.out.println("-----------Calculator BMI-------------");
        System.out.println("--------------------------------------");

        System.out.println("obs:use the caracter , for separete the numbers (ex.:1,65)");
        System.out.println("What is your height? ");
        height = sc.nextDouble();
        System.out.println("What is your weight? ");
        weight = sc.nextDouble();

        double calculateBMI = (weight / (height * height));
        double BMI = calculateBMI;

        System.out.println("Your BMI is " + BMI);

        if (BMI <= 18.5) {   // If it is less than or equal to 18.5 "Underweight";
            System.out.println("you're Underweight");
        } else if (BMI > 18.6 && BMI < 25) {   // If it is between 18.6 and 24.9 "Ideal weight";
            System.out.println("you're Ideal weight");
        } else if (BMI < 30) {
            System.out.println("you're Obese");
        } else if (BMI > 25.0 && BMI < 29.9) { //If it is between 25.0 and 29.9 "Slightly overweight";
            System.out.println("you're Slightly overweight");
        } else if (BMI > 30 && BMI < 34.9) { //If it is between 30.0 and 34.9 "Grade I Obesity";
            System.out.println("you're Grade I Obesity");
        } else if (BMI > 34.9 && BMI < 39) { // If it is between 35.0 and 39.9 "Grade II (Severe) Obesity";
            System.out.println("you're Grade II (Severe) Obesity");
        } else if (BMI >= 40) { // If it is greater than or equal to 40.0 "Grade III (Morbid) Obesity";bida)";
            System.out.println("you're Grade III (Morbid) Obesity");
        } else {
            System.out.println("Sorry, don't understand. Please try again."); // erro mensage
        }

        System.out.println("--------------------------------------");

    }
}
