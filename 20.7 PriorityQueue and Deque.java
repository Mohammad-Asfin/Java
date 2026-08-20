import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Concept: PriorityQueue and Deque
 * 
 * 1. PriorityQueue: Unlike standard Queues (FIFO), elements in a PriorityQueue 
 *    are ordered according to their natural ordering (or a supplied Comparator).
 * 
 * 2. Deque (Double Ended Queue): Allows insertion and removal at both ends. 
 *    ArrayDeque is the preferred implementation for stacks (LIFO) and queues.
 */
public class Demo {
    public static void main(String[] args) {
        
        System.out.println("--- PriorityQueue ---");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);
        
        // Elements are processed in sorted (priority) order, not insertion order.
        System.out.println("Processing PriorityQueue:");
        while (!pq.isEmpty()) {
            System.out.println("Polled: " + pq.poll()); // Will print 10, 20, 30, 50
        }

        System.out.println("\n--- ArrayDeque as a Stack (LIFO) ---");
        Deque<String> stack = new ArrayDeque<>();
        
        // push() adds to the top of the stack
        stack.push("Page 1");
        stack.push("Page 2");
        stack.push("Page 3");
        
        System.out.println("Stack: " + stack);
        
        // pop() removes from the top
        System.out.println("Popped: " + stack.pop()); // Removes Page 3
        System.out.println("Remaining Stack: " + stack);
    }
}
