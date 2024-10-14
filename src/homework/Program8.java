package homework;

import java.util.Scanner;

public class Program8 {
    /**
     * Write a program to calculate the area of a triangle.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the base of a triangle");
        int base = scanner.nextInt();

        System.out.println("Enter the height of a triangle");
        int height = scanner.nextInt();

        System.out.println("Enter the area of a triangle");
        int area = (base * height) / 2;

        System.out.println("The area of a triangle is: " + area);



    }
}
