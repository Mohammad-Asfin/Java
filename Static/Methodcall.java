public class Methodcall {
    static void staticMethod() {
        System.out.println("Static method called");
    }

    void instanceMethod() {
        System.out.println("Instance method called");
    }

    public static void main(String[] args) {
        staticMethod(); // static call

        Methodcall obj = new Methodcall();
        obj.instanceMethod(); // instance call
    }
}
