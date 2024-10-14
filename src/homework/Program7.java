package homework;

import java.util.Scanner;

public class Program7 {
    /**
     *  Write a program to insert any temperature value in degree Fahrenheit and
     convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any temperature in fahrenheit");
        int fahrenheit = scanner.nextInt();

        int celsius = (fahrenheit - 32) * 5/9;

        System.out.println("The temperature  in Celsius is: " + celsius);

    }
}
