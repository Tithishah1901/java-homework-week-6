package homework;

public class Program15 {
    /**
     * Write a Java program to swap two variables.
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int temp = a;

        System.out.println("Before swapping : a, b = "+ a +", "+ b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : a,b =" + a +"," + b);
        


    }

}
