import java.util.Scanner;

public class Rectangle {

    // Data members
    double length;
    double breadth;

    // Function to input length and breadth
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }

    // Function to output the length, breadth and area
    public void output() {
        System.out.println("Rectangle dimensions: ");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of rectangle: " + calcArea());
    }

    // Function to calculate the area of the rectangle
    public double calcArea() {
        return length * breadth;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle rect = new Rectangle();

        // Input dimensions
        rect.input();

        // Output dimensions and area
        rect.output();
    }
}
