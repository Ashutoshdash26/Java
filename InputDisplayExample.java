import java.util.Scanner; // Import the Scanner class

public class InputDisplayExample {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        scanner.close();
    }
}
