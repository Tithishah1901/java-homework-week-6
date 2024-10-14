package homework;

import java.util.Scanner;

public class program6 {
    /**
     * Write a program to enter any radius value of the circle and find out the
     area.(Formula of Area A=PI*r*r).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any radius value of the circle");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Any area of the circle is: " + area);

        scanner.close();

    }
}
