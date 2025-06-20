public class Static {
    static int s1 = 11;
    static int s2 = 22;
    int i1 = 33;
    int i2 = 44;

    public static void main(String[] args) {
        Static obj = new Static();
        System.out.println("Static variables: " + s1 + ", " + s2);
        System.out.println("Instance variables: " + obj.i1 + ", " + obj.i2);
    }
}
