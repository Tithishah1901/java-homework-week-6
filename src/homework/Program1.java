package homework;

/**
 * program 1
 * Declare two instance variables.
 * Declare one instance method.
 * Call both instance variables into the instance method inside the print statement.
 * Declare the Main method.
 * Call the above instance method into the Main method and Run the programme.
 */

// Declare two instance variables.
public class Program1 {
    int a = 15;
    String name = "Tithi";

    // Declare the Main method.
    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.m1();

    }

    // Declare one instance method.
 public void m1(){
     System.out.println(a);
     System.out.println(name);
 }
    }

