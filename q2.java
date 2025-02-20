public class ArithmeticAndBitwiseOperators {
    public static void main(String[] args) {
        // Declare and initialize some variables
        int a = 15, b = 4;
        int x = 9, y = 3;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");

        // Addition
        System.out.println("a + b = " + (a + b));

        // Subtraction
        System.out.println("a - b = " + (a - b));

        // Multiplication
        System.out.println("a * b = " + (a * b));

        // Division
        System.out.println("a / b = " + (a / b));  // Integer division (result is int)

        // Modulus (remainder)
        System.out.println("a % b = " + (a % b));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");

        // AND (bitwise)
        System.out.println("x & y = " + (x & y));  // 9 = 1001, 3 = 0011, AND = 0001 (1)

        // OR (bitwise)
        System.out.println("x | y = " + (x | y));  // 9 = 1001, 3 = 0011, OR = 1011 (11)

        // XOR (bitwise)
        System.out.println("x ^ y = " + (x ^ y));  // 9 = 1001, 3 = 0011, XOR = 1010 (10)

        // Left Shift (<<)
        System.out.println("x << 2 = " + (x << 2));  // 9 = 1001, left shift by 2 -> 100100 (36)

        // Right Shift (>>)
        System.out.println("x >> 2 = " + (x >> 2));  // 9 = 1001, right shift by 2 -> 0010 (2)

        // Unsigned Right Shift (>>>)
        System.out.println("x >>> 2 = " + (x >>> 2));  // 9 = 1001, unsigned right shift by 2 -> 0010 (2)
    }
}
