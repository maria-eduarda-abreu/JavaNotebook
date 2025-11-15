package basic;

/*
The compiler and the computer need to understand all data types,
operations, and method calls.
*/

public class DataTypes {

    public static void main(String[] args) {

        /*
        INTEGERS: negative and positive numbers without a decimal point
        */
        System.out.println("--- Inteiros ---");
        System.out.println(1);
        System.out.println(-1);
        System.out.println(0);

        /* FLOATING-POINT: Real numbers (double and float)
        Note: In programming, we use a period (.) instead of a comma (,)
        */
        System.out.println("--- Ponto Flutuante (double) ---");
        // By default, numbers with a decimal point are 'double'
        System.out.println(1.3);
        System.out.println(-1.3);
        System.out.println(2.1);

        System.out.println("--- Ponto Flutuante (float) ---");
        // For 'float', we need to add an 'f' at the end
        System.out.println(2.3f);
        System.out.println(6.2f);
        System.out.println(3f);

        /*
        BOOLEANS:
        stores only two values, true or false
         */
        System.out.println("--- BOOLEANOS ---");
        System.out.println(true);
        System.out.println(false);

        // Will display false, because 5 is not less than 4
        System.out.println(5 < 4);

        /* CHAR
        stores only one character, whether it's a letter or a special character.
         */
        System.out.println("--- CHAR ---");
        System.out.println('c');
        System.out.println('a');
        System.out.println('2');
        System.out.println('!');

        /*STRING
        Strings are a set of characters, i.e., a word. And it is an object.
         */
        System.out.println("--- STRING ---");
        System.out.println("Things i hate:");
        System.out.println("- java");
        System.out.println("- lists");
        System.out.println("- irony");
    }
}