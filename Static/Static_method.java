public class Static_method {
    int x = 100;
    int y = 200;

    static void showInstanceVars() {
        Static_method obj = new Static_method(); // create object to access instance variables
        System.out.println("x = " + obj.x);
        System.out.println("y = " + obj.y);
    }

    public static void main(String[] args) {
        showInstanceVars();
    }
}
