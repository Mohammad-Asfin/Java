/**
 * Concept: Generic Methods
 * 
 * You don't have to make the entire class generic just to have a generic method.
 * You can declare the type parameter <T> right before the return type of the method.
 */
public class Demo {
    
    // Generic Method
    // <T> declares that this method uses a generic type T
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Spring", "Hibernate"};
        
        System.out.println("Printing Integer Array:");
        printArray(intArray); // The compiler infers that T is Integer
        
        System.out.println("Printing String Array:");
        printArray(strArray); // The compiler infers that T is String
    }
}
