public class Example1 {
    void sayHello() {
        System.out.println("Hello from instance method!");
    }

    static void callInstanceMethod() {
        Example1 obj = new Example1(); // create object
        obj.sayHello(); // call instance method
    }

    public static void main(String[] args) {
        callInstanceMethod();
    }
}
