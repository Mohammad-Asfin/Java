import java.util.ArrayList;
import java.util.List;

/**
 * Concept: Bounded Types and Wildcards
 * 
 * 1. Bounded Types (<T extends Number>) limit the types that can be passed.
 * 2. Wildcards (?) are used when the exact type is unknown.
 * 
 * PECS Principle:
 * - Producer Extends (? extends T): Use when you only READ data from the collection.
 * - Consumer Super (? super T): Use when you only WRITE data to the collection.
 */
public class Demo {
    
    // 1. Bounded Type: T must be a subclass of Number (Integer, Double, etc.)
    public static <T extends Number> double addNumbers(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // 2. Wildcard (? extends Number): We can pass a List of any Number subclass
    // We can READ from this list, but we cannot add to it safely. (Producer Extends)
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        // Testing Bounded Type
        System.out.println("Addition: " + addNumbers(10, 20.5)); // Integer and Double work
        
        // Testing Wildcards
        List<Integer> intList = new ArrayList<>();
        intList.add(1); intList.add(2);
        
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1); doubleList.add(2.2);
        
        System.out.print("Integer List: ");
        printNumbers(intList);
        
        System.out.print("Double List: ");
        printNumbers(doubleList);
    }
}
