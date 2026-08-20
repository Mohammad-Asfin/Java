import java.util.Optional;

/**
 * Concept: Optional Class (Java 8)
 * 
 * NullPointerException (NPE) is the most common error in Java.
 * Optional is a container object used to contain not-null objects. 
 * It forces the programmer to explicitly check if a value is present, 
 * helping avoid NPEs.
 */
public class Demo {
    
    // Simulating a database fetch that might fail
    public static Optional<String> findStudentById(int id) {
        if (id == 1) {
            return Optional.of("Asfin"); // Value is present
        } else {
            return Optional.empty(); // Value is absent (instead of returning null)
        }
    }

    public static void main(String[] args) {
        
        Optional<String> student = findStudentById(2);

        // 1. The bad way (can still cause exceptions if not careful)
        if (student.isPresent()) {
            System.out.println("Found: " + student.get());
        } else {
            System.out.println("Student not found.");
        }

        // 2. The good way (Functional style)
        // orElse: returns a default value if empty
        String name = student.orElse("Unknown Student");
        System.out.println("Using orElse: " + name);
        
        // ifPresent: executes the lambda only if the value exists
        student.ifPresent(s -> System.out.println("Executing lambda because student exists: " + s));
    }
}
