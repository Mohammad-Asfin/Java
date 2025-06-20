public class Example2 {
    static void greet() {
        System.out.println("Hello from static method!");
    }

    void callStaticMethod() {
        greet(); // directly calling static method
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.callStaticMethod();
    }
}
