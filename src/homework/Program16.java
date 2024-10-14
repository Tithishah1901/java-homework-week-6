package homework;

import java.util.Scanner;

public class Program16 {
    /**
     *  Write a Java program to add two binary numbers.
     *  Input Data:
     *   Input first binary number: 10
     *   Input second binary number: 11
     *
     *  Expected Output:
     *
     *   Sum of two binary numbers: 101
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first binary number
        System.out.println("Input first binary number: ");
        String binary1 = scanner.nextLine();

        //Input second binary number
        System.out.println("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // convert the two decimal numbers
        int number1 = Integer.parseInt(binary1, 2);
        int number2 = Integer.parseInt(binary2,2);

        // add the decimal numbers
        int sum = number1 + number2;

        // convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("sum of two binary numbers: "+ binarySum);


    }
}
