import java.util.Scanner;
import java.util.Arrays; // Needed for Arrays.toString()

public class DynamicArrayCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Array Creator ---");

        // 1. Get Array Type
        System.out.println("Enter the type of array elements:");
        System.out.println("1. Integer (int)");
        System.out.println("2. Double (double)");
        System.out.println("3. String (String)");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int typeChoice = -1;
        try {
            typeChoice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for type choice. Please enter a number.");
            scanner.close();
            return;
        }

        // 2. Get Array Size
        System.out.print("Enter the size of the array: ");
        int arraySize = -1;
        try {
            arraySize = Integer.parseInt(scanner.nextLine());
            if (arraySize <= 0) {
                System.out.println("Array size must be positive. Exiting.");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for array size. Please enter a valid number. Exiting.");
            scanner.close();
            return;
        }

        Object array = null; // Use Object to hold different array types

        switch (typeChoice) {
            case 1: // Integer Array
                int[] intArray = new int[arraySize];
                System.out.println("\nEnter " + arraySize + " integer elements:");
                for (int i = 0; i < arraySize; i++) {
                    System.out.print("Element [" + i + "]: ");
                    try {
                        intArray[i] = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid integer input. Please try again from scratch.");
                        scanner.close();
                        return;
                    }
                }
                array = intArray; // Assign the specific array to the generic Object array
                break;

            case 2: // Double Array
                double[] doubleArray = new double[arraySize];
                System.out.println("\nEnter " + arraySize + " double elements:");
                for (int i = 0; i < arraySize; i++) {
                    System.out.print("Element [" + i + "]: ");
                    try {
                        doubleArray[i] = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid double input. Please try again from scratch.");
                        scanner.close();
                        return;
                    }
                }
                array = doubleArray;
                break;

            case 3: // String Array
                String[] stringArray = new String[arraySize];
                System.out.println("\nEnter " + arraySize + " string elements:");
                for (int i = 0; i < arraySize; i++) {
                    System.out.print("Element [" + i + "]: ");
                    stringArray[i] = scanner.nextLine();
                }
                array = stringArray;
                break;

            default:
                System.out.println("Invalid choice for array type. Exiting.");
                scanner.close();
                return;
        }

        System.out.println("\n--- Created Array ---");
        // Display the array using Arrays.toString()
        if (array instanceof int[]) {
            System.out.println(Arrays.toString((int[]) array));
        } else if (array instanceof double[]) {
            System.out.println(Arrays.toString((double[]) array));
        } else if (array instanceof String[]) {
            System.out.println(Arrays.toString((String[]) array));
        } else {
            System.out.println("Could not display array."); // Should not happen with valid input
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
