package homework;

import java.util.Scanner;

public class Program5 {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods.(Note: Two static and Two instance methods.)
     */


    public static void main(String[] args) {
        Program5 obj = new Program5();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number for addition");
        int a = scanner.nextInt();

        System.out.println("Enter second number for addition");
        int b = scanner.nextInt();
        obj.addition(a, b);


        System.out.println("Enter first number for Subtraction");
        int c = scanner.nextInt();

        System.out.println("Enter second number for Subtraction");
        int d = scanner.nextInt();
        obj.Subtraction(c, d);

        System.out.println("Enter first number for Multiplication");
        int e = scanner.nextInt();

        System.out.println("Enter second number for Multiplication");
        int f = scanner.nextInt();
        Multiplication(e, f);

        System.out.println("Enter first number for Division");
        int g = scanner.nextInt();

        System.out.println("Enter second number for Division");
        int h = scanner.nextInt();
        Division(g, h);


    }

    public void addition(int a, int b) {
        int result = (a + b);
        System.out.println(result);

    }

    public void Subtraction(int c, int d) {
        int result = (c - d);
        System.out.println(result);

    }

    public static void Multiplication(int e, int f) {
        int result = (e * f);
        System.out.println(result);
    }

    public static void Division(int g, int h) {
        int result = (g / h);
        System.out.println(result);
    }
}
