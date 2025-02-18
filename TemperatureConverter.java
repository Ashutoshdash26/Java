import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Available units: Celsius (C), Fahrenheit (F), Kelvin (K)");

        
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        // Input original unit
        System.out.print("Enter the original unit (C, F, K): ");
        char originalUnit = scanner.next().toUpperCase().charAt(0);

        // Input target unit
        System.out.print("Enter the target unit (C, F, K): ");
        char targetUnit = scanner.next().toUpperCase().charAt(0);

        double convertedTemperature = 0;

        // Convert temperature based on original and target units
        switch (originalUnit) {
            case 'C':
                convertedTemperature = convertFromCelsius(temperature, targetUnit);
                break;
            case 'F':
                convertedTemperature = convertFromFahrenheit(temperature, targetUnit);
                break;
            case 'K':
                convertedTemperature = convertFromKelvin(temperature, targetUnit);
                break;
            default:
                System.out.println("Error: Invalid original unit.");
                return; // Exit the program
        }

        // Display the converted temperature
        System.out.println("Converted Temperature: " + convertedTemperature + " " + targetUnit);

        scanner.close();
    }

    // Conversion methods
    public static double convertFromCelsius(double celsius, char targetUnit) {
        switch (targetUnit) {
            case 'F':
                return (celsius * 9 / 5) + 32; // Celsius to Fahrenheit
            case 'K':
                return celsius + 273.15; // Celsius to Kelvin
            case 'C':
                return celsius; // No conversion needed
            default:
                System.out.println("Error: Invalid target unit.");
                System.exit(1); // Exit the program
                return 0;
        }
    }

    public static double convertFromFahrenheit(double fahrenheit, char targetUnit) {
        switch (targetUnit) {
            case 'C':
                return (fahrenheit - 32) * 5 / 9; // Fahrenheit to Celsius
            case 'K':
                return (fahrenheit - 32) * 5 / 9 + 273.15; // Fahrenheit to Kelvin
            case 'F':
                return fahrenheit; // No conversion needed
            default:
                System.out.println("Error: Invalid target unit.");
                System.exit(1); // Exit the program
                return 0;
        }
    }

    public static double convertFromKelvin(double kelvin, char targetUnit) {
        switch (targetUnit) {
            case 'C':
                return kelvin - 273.15; // Kelvin to Celsius
            case 'F':
                return (kelvin - 273.15) * 9 / 5 + 32; // Kelvin to Fahrenheit
            case 'K':
                return kelvin; // No conversion needed
            default:
                System.out.println("Error: Invalid target unit.");
                System.exit(1); // Exit the program
                return 0;
        }
    }
}
