public class AreaCalculator {
    public double calculateArea(double side) {
        return side * side;
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        double squareArea = calculator.calculateArea(4);
        System.out.println("Area of the square: " + squareArea);
        double rectangleArea = calculator.calculateArea(5, 3);
        System.out.println("Area of the rectangle: " + rectangleArea);
        double triangleArea = calculator.calculateArea(6, 4, true);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
