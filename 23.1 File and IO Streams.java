import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Concept: File Handling using java.io
 * 
 * This example demonstrates the classic (legacy) way of handling files in Java.
 * We use File to represent the path, and BufferedReader/BufferedWriter for efficient 
 * reading and writing.
 */
public class Demo {
    public static void main(String[] args) {
        
        File file = new File("demo_student.txt");

        // 1. Writing to a file using try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("ID: 101, Name: Asfin\n");
            writer.write("ID: 102, Name: Rohan\n");
            System.out.println("Data successfully written to file: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }

        System.out.println("---------------------------------");

        // 2. Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("Reading contents of the file:");
            String line;
            // Read line by line until null (end of file) is reached
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
    }
}
