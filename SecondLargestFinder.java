import java.util.Scanner;

public class SecondLargestFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of elements from the user
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("Please enter at least 2 integers to find the second largest number.");
            return;
        }
        
        // Store the integers in an array
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Find and display the second largest number
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest number is: " + secondLargest);
        
        scanner.close();
    }
    
    // Method to find the second largest number in an array
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }
}