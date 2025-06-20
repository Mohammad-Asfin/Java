public class Inst_var{
    static int a = 50;
    static int b = 60;

    void displayStaticVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Inst_var obj = new Inst_var();
        obj.displayStaticVars();
    }
}
