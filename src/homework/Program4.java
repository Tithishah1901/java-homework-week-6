package homework;

public class Program4 {
    /**
     * Declare two instance and two static variables.
     * Declare one instance method.
     * Declare one static method.
     * Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * Declare the Main method.
     * Call both instance and static methods into the Main method and run the programme.
     */

    //  Declare two instance and two static variables.
    int a = 20;
    int b = 10;
    static int c = 15;
    static String name = "Shah";

    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.m1();
        t1();
    }

    // Declare one instance method.
    public void m1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(name);
    }

    // Declare one static method.
    public static void t1() {
        Program4 obj = new Program4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(name);

    }
}