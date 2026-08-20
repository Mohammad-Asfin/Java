/**
 * Concept: Generics in Java
 * 
 * Why Generics?
 * Generics allow you to parameterize types. They provide compile-time type safety 
 * and eliminate the need for casting. Instead of using 'Object' and risking 
 * ClassCastException at runtime, you can specify exactly what type a class holds.
 */

// A Generic Class
// 'T' stands for Type. It will be replaced by a real type (like Integer, String) when instantiated.
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Demo {
    public static void main(String[] args) {
        
        // 1. Creating a Box for Strings
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("String Box contains: " + stringBox.getItem());
        
        // stringBox.setItem(123); // COMPILE ERROR! Type safety prevents this.

        // 2. Creating a Box for Integers (Note: We use the wrapper class Integer, not int)
        Box<Integer> intBox = new Box<>();
        intBox.setItem(100);
        System.out.println("Integer Box contains: " + intBox.getItem());
    }
}
