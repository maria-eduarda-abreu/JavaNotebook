package basic;
/*
The mathematical operators { +, -, *, /, %, ++ and __ }
 */
public class Operators {
    public static void main(String[] args) {
        int num1  = 10;
        int num2 = 10;

        int add = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("The result of addition " + num1 + " + " + num2 + " = " + add);
        System.out.println("The result of subtraction " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("The result of multiplication " + num1 + " * " + num2 + " = " + multiplication);
        System.out.println("The result of division " + num1 + " / " + num2 + " = " + division);
        System.out.println("The result of remainder " + num1 + " % " + num2 + " = " + remainder);

        // The operators ++ and -- are the way to add 1 or subtract 1

        int variavel1 = 10; //integer type variable named "variavel1" receives the value 10.

        System.out.println(variavel1); //shows the value of variavel1

        variavel1++; //increments the value of the integer type by 1.

        System.out.println(variavel1); //shows the incremented value of variavel1

        int variavel2 = 20; //integer type variable named "variavel2" receives the value 20.

        System.out.println(variavel2); //shows the value of variavel2

        variavel2--; //decrements the value of variavel2 by 1.

        System.out.println(variavel2);

        //Note: Operations in parentheses will be resolved first,
        //then multiplication, division, and modulus.
    }

}
