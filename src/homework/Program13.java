package homework;

import java.util.Scanner;

public class Program13 {
    /**
     *  Write a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number:");
        int b = in.nextInt();
        System.out.println("Enter the third number:");
        int c = in.nextInt();

        System.out.println("The average value is  " + average(a,b,c)+ "\n" );


    }
    public static int average(int a,int b,int c){
        return (a+b+c)/ 3;
    }
}
