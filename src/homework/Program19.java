package homework;

public class Program19 {
    /**
     *  Write a Java program to convert a given string into lowercase.
     *       Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     *        Output: the quick brown fox jumps over the lazy dog.
     */

    public static void main(String[] args) {
        //sample input
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

        // convert to lowercase
        String output = input.toLowerCase();

        System.out.println("Output: " + output);

    }
}
