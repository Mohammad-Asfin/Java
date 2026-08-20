import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Concept: Concurrent Collections
 * 
 * Standard collections (like HashMap, ArrayList) are NOT thread-safe.
 * If multiple threads modify a standard HashMap simultaneously, it can cause 
 * corrupted data or an infinite loop.
 * 
 * ConcurrentHashMap is specifically designed for high concurrency. 
 * It locks only parts of the map instead of the whole map (unlike Hashtable).
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        
        // Unsafe map
        // Map<String, Integer> map = new HashMap<>(); 
        
        // Thread-safe map
        Map<String, Integer> map = new ConcurrentHashMap<>();

        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put("A", map.getOrDefault("A", 0) + 1);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put("B", map.getOrDefault("B", 0) + 1);
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // If we used a regular HashMap, the results might be inconsistent or crash.
        // With ConcurrentHashMap, both threads operate safely.
        System.out.println("Final Map: " + map);
    }
}
