package homework;

import java.util.Locale;

public class Program9 {
    /**
     * Write a program to convert the upper case to lower case.
     */

    public static void main(String[] args) {
        String name = "TITHI";
        String lowercase =name.toLowerCase(Locale.ROOT);
        System.out.println("Original String: " + name);
        System.out.println("lowercase String:" +  lowercase);

    }
}
