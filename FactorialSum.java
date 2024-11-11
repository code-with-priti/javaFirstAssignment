import java.util.Scanner;
import java.math.BigInteger;

public class FactorialSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Calculate the factorial
        BigInteger factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        // Calculate the sum of digits
        int sumOfDigits = sumOfDigits(factorial);
        System.out.println("Sum of the digits of the factorial is: " + sumOfDigits);
        
        scanner.close();
    }

    // Method to calculate factorial of a number using BigInteger
    public static BigInteger calculateFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Method to calculate the sum of digits of a BigInteger
    public static int sumOfDigits(BigInteger number) {
        int sum = 0;
        String numStr = number.toString();
        
        for (int i = 0; i < numStr.length(); i++) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        
        return sum;
    }
}
