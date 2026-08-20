import java.util.Arrays;
import java.util.List;

/**
 * Concept: Method References (Java 8)
 * 
 * Method References are a shorthand syntax for a Lambda expression that 
 * does nothing but call an existing method. They make code even more readable.
 * Syntax: ClassName::methodName
 */
public class Demo {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Navin", "Harsh", "Sushil");

        // 1. Using a standard for-loop
        System.out.println("Using Standard for-loop:");
        for(String name : names) {
            System.out.println(name);
        }

        // 2. Using Lambda Expression (Java 8)
        System.out.println("\nUsing Lambda:");
        names.forEach(name -> System.out.println(name));

        // 3. Using Method Reference (Java 8)
        // System.out is the object, println is the method
        System.out.println("\nUsing Method Reference:");
        names.forEach(System.out::println);
    }
}
