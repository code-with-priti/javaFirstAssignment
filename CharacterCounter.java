import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the string input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Get the character to search for
        System.out.print("Enter the character to search for: ");
        char searchChar = scanner.next().charAt(0);
        
        // Count the occurrences of the character
        int count = countOccurrences(inputString, searchChar);
        
        // Display the count
        System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");
        
        scanner.close();
    }
    
    // Method to count occurrences of a character in a string
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

