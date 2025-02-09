package homework;

public class Program14 {
    /**
     * Write a Java program to print the area and perimeter of a rectangle.
     *  Test Data:
     *   Width = 5.5 Height = 8.5
     *     Expected Output:
     *  Area is 5.6 * 8.5 = 47.60
     *  Perimeter is 2 * (5.6 + 8.5) = 28.20
     */

    public static void main(String[] args) {
        double Width = 5.6;
        double Height = 8.5;

        double perimeter = 2 * (Width+Height);
        double area = Width * Height;
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", Width,Height,perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n",Width,Height,area);



    }
}
