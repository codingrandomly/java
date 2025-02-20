public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 1;  // Starting range
        int end = 100;  // Ending range

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        // Loop through the numbers in the range
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }

        // Check divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true;  // Prime if not divisible by any other number
    }
}
