import java.util.Scanner;

public class dhruv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();

        // Initialize result
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + num + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }
}
