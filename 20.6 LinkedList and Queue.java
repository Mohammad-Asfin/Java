import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

/**
 * Concept: LinkedList and Queue
 * 
 * LinkedList implements both the List and Queue interfaces.
 * - As a List: It performs better than ArrayList for insertions/deletions 
 *   in the middle of the list because elements are linked, not shifted.
 * - As a Queue: It follows First-In-First-Out (FIFO) principles.
 */
public class Demo {
    public static void main(String[] args) {
        
        System.out.println("--- Using LinkedList as a List ---");
        List<String> names = new LinkedList<>();
        names.add("Asfin");
        names.add("Rohan");
        names.add(1, "Navin"); // Insert at index 1 (Faster than ArrayList)
        System.out.println("List: " + names);

        System.out.println("\n--- Using LinkedList as a Queue (FIFO) ---");
        Queue<String> queue = new LinkedList<>();
        
        // add/offer insert elements at the end
        queue.offer("Customer 1");
        queue.offer("Customer 2");
        queue.offer("Customer 3");
        
        System.out.println("Queue: " + queue);
        
        // peek() retrieves the head without removing it
        System.out.println("Next in line (peek): " + queue.peek());
        
        // poll() retrieves AND removes the head of the queue
        System.out.println("Serving (poll): " + queue.poll());
        
        System.out.println("Remaining Queue: " + queue);
    }
}
