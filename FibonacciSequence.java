import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Create an array to store the Fibonacci sequence
            int[] fibonacciArray = new int[n];
            
            // Generate the Fibonacci sequence
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    fibonacciArray[i] = 0;
                } else if (i == 1) {
                    fibonacciArray[i] = 1;
                } else {
                    fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
                }
            }
            
            // Print the Fibonacci sequence
            System.out.println("First " + n + " terms of the Fibonacci sequence:");
            for (int num : fibonacciArray) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}

