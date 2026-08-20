import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.HashMap;

/**
 * Concept: TreeMap vs LinkedHashMap vs HashMap
 * 
 * 1. HashMap: Does NOT maintain insertion order. (Fastest)
 * 2. LinkedHashMap: Maintains Insertion Order. (Slightly slower, uses doubly-linked list)
 * 3. TreeMap: Sorts the elements based on the natural ordering of the Keys. (Slowest)
 */
public class Demo {
    public static void main(String[] args) {
        
        System.out.println("--- HashMap (No Order) ---");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Zebra", 1);
        hashMap.put("Apple", 2);
        hashMap.put("Mango", 3);
        System.out.println(hashMap); // Order is unpredictable

        System.out.println("\n--- LinkedHashMap (Insertion Order) ---");
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Zebra", 1);
        linkedMap.put("Apple", 2);
        linkedMap.put("Mango", 3);
        System.out.println(linkedMap); // Prints Zebra, Apple, Mango

        System.out.println("\n--- TreeMap (Sorted Order by Key) ---");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 1);
        treeMap.put("Apple", 2);
        treeMap.put("Mango", 3);
        System.out.println(treeMap); // Prints Apple, Mango, Zebra
    }
}
