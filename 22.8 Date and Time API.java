import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Concept: Date and Time API (Java 8 / java.time)
 * 
 * Before Java 8, java.util.Date and java.util.Calendar were poorly designed, 
 * mutable, and not thread-safe. Java 8 introduced a completely new API under 
 * java.time which is immutable and much easier to use.
 */
public class Demo {
    public static void main(String[] args) {
        
        // 1. LocalDate (Date without time)
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);
        
        LocalDate specificDate = LocalDate.of(2025, 12, 25);
        System.out.println("Specific Date: " + specificDate);
        
        // 2. LocalTime (Time without date)
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);
        
        // 3. LocalDateTime (Both date and time)
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
        
        // 4. Formatting Dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = currentDateTime.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
