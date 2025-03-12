import java.util.Scanner;
public class Rectangle {
    double length;
    double breadth;
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }
    public void output() {
        System.out.println("Rectangle dimensions: ");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of rectangle: " + calcArea());
    }
    public double calcArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.input();

        rect.output();
    }
}
