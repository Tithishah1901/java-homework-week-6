package homework;

public class Program3 {
    /**
     * Declare one instance and one static variable.
     * Declare one instance method.
     * Declare one static method.
     * Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * Declare the Main method.
     * Call both instance and static methods into the Main method and run the programme.
     */

    //Declare one instance and one static variable
     int a = 15;
    static String name = "Tithi";

    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.m1();
        t1();
    }

    // Declare one instance method.
    public void m1() {
        System.out.println(a);
        System.out.println(name);
    }

    // Declare one static method.
    public static void t1() {
        Program3 obj = new Program3();
        System.out.println(obj.a);
        System.out.println(name);
    }


}
