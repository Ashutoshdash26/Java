import java.util.Scanner; // Import the Scanner class

public class InputDisplayExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");

        // Read the input as a String
        String name = scanner.nextLine();

        // Display the input back to the user
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
