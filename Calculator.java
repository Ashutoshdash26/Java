import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Available operations: +, -, *, /");

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        // Perform calculation based on the operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return; // Exit the program
        }

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
