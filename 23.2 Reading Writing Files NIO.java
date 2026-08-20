import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.List;

/**
 * Concept: File Handling using java.nio (New I/O)
 * 
 * Introduced in Java 7, java.nio (Files and Paths) is the modern, preferred way 
 * to handle files. It provides much simpler methods for reading all lines or 
 * writing strings directly without manually opening BufferedReaders.
 */
public class Demo {
    public static void main(String[] args) {
        
        // Define the path
        Path path = Paths.get("modern_demo.txt");

        try {
            // 1. Writing to a file (creates it if it doesn't exist)
            String content = "Learning Java NIO is fun!\nSpring Boot is next.";
            Files.writeString(path, content);
            System.out.println("File created and text written successfully.");

            // Append mode example
            Files.writeString(path, "\nAppending this new line.", StandardOpenOption.APPEND);

            System.out.println("---------------------------------");

            // 2. Reading all lines from the file
            System.out.println("Reading file using Files.readAllLines():");
            List<String> lines = Files.readAllLines(path);
            
            // Print using Java 8 forEach method reference
            lines.forEach(System.out::println);
            
        } catch (IOException e) {
            System.out.println("An NIO Error Occurred: " + e.getMessage());
        }
    }
}
