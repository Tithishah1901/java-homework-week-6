package homework;

import java.util.Scanner;

public class Program17 {
    /**
     * Write a Java program to convert a decimal number to binary number.
     *  Input Data:
     *       Input a Decimal Number : 5
     *  Expected Output
     *    Binary number is: 101
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a decimal number");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is : "+ binary);


    }
}
