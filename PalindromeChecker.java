import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept a string input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
    
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversedStr = reverseString(str);
        return str.equalsIgnoreCase(reversedStr);  // Compare ignoring case
    }
    
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}


