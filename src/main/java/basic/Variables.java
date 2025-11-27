package basic;
/*
Variables are ways of storing something in computer memory
that can be reused throughout the code. They are extremely important, and so is their typing.
 */
public class Variables {
    public static void main(String[] args) {

        //type name = value;
        var nomeVariavel = "txt";
        String name = "Doda";
        // integers variable, types --> ( byte, short, int, long) economize memory use this types
        int age = 20; //integers variable: 32 bits --> -2.147.483.648 / 2.147.483.647
        byte salary = 100; //integers variable: 8 bits --> -128 / 127
        short salary2 = (short) 100; //integers variable: 16 bits --> -32.768 / 32.767
        long totalSalary = (long) 100L;//integers variable: 64 bits --> -9.223.372.036.854.775.808 / 9.223.372.036.854.775.807
        // decimal numbers
        double AverageAge = 18.53; // 64 bits --> -9.223.372.036.854.775.808 -precision
        float note = 9.1f; // 32 bits --> 1.4e-45 / 3. 4028235e+38 - simple
        System.out.println("My name is " + name + ", I am " + age + " years old, " + "the average age is " + AverageAge +" my note is " + note + " and i am above average age ");
        System.out.println();

    }
}
