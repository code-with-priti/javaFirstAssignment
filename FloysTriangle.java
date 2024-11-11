import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int n = scanner.nextInt();

        int number = 1;  // Start the sequence from 1

        // Print Floyd's Triangle
        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();  // Move to the next line after each row
        }

        scanner.close();
    }
}

