import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers you want: ");
        int n = scanner.nextInt();
        int[] fibArray = new int[n];
        if (n > 0) fibArray[0] = 0; 
        if (n > 1) fibArray[1] = 1; 
        for (int i = 2; i < n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibArray[i] + " ");
        }
        System.out.println();
    }
}
