/*In programming, classes are like recipes for an object that contain characteristics and behaviors;
you can store properties and methods within them.
*/

package basic;

public class Hello {
    public static void main(String args[]) {
        System.out.println("Hello Word sô!");
    }
}

/*
- The `public` attribute defines that the class is public, therefore anyone in the code can access it.
- The `static` attribute indicates that the member can be accessed without needing to instantiate the class.
- `void` means it returns nothing.
- `main` means it's the main class; it's the only function needed for the compiler to identify where to start the file.
- `System.out` is an object for standard output, and `println` displays something on the screen that will be passed as a parameter within the parentheses; in our case, it's a String (text).
*/