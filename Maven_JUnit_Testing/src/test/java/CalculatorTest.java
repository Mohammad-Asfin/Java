import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Concept: JUnit 5 Unit Testing
 * 
 * - @Test: Marks a method as a test case.
 * - @BeforeEach: Runs before EVERY test (good for setting up objects).
 * - @AfterEach: Runs after EVERY test (good for closing resources).
 * - Assertions: Methods like assertEquals() verify the expected output matches the actual output.
 */
public class CalculatorTest {

    private Calculator calculator;

    // Runs before every single @Test method
    @BeforeEach
    public void setUp() {
        System.out.println("Setting up Calculator instance before test...");
        calculator = new Calculator();
    }

    // Runs after every single @Test method
    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        calculator = null;
    }

    @Test
    public void testAdd() {
        int result = calculator.add(10, 5);
        // expected, actual, message if failed
        assertEquals(15, result, "10 + 5 should equal 15");
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(20, 8);
        assertEquals(12, result, "20 - 8 should equal 12");
    }

    @Test
    public void testDivideByZero() {
        // AssertThrows expects a specific Exception to be thrown
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
