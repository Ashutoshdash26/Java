import java.util.Scanner;

public class CombineJaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of rows for the first jagged array: ");
        int rows1 = scanner.nextInt();
        int[][] jaggedArray1 = inputJaggedArray(scanner, rows1, "First");

       
        System.out.print("\nEnter the number of rows for the second jagged array: ");
        int rows2 = scanner.nextInt();
        int[][] jaggedArray2 = inputJaggedArray(scanner, rows2, "Second");

       
        int[][] combinedJaggedArray = new int[rows1 + rows2][];

        
        for (int i = 0; i < rows1; i++) {
            combinedJaggedArray[i] = jaggedArray1[i];
        }

        
        for (int i = 0; i < rows2; i++) {
            combinedJaggedArray[rows1 + i] = jaggedArray2[i];
        }

        
        System.out.println("\nCombined Jagged Array:");
        displayJaggedArray(combinedJaggedArray);

        scanner.close();
    }

    
    public static int[][] inputJaggedArray(Scanner scanner, int rows, String arrayName) {
        int[][] jaggedArray = new int[rows][];
        
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + " of " + arrayName + " jagged array: ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols];

            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }
        return jaggedArray;
    }

    
    public static void displayJaggedArray(int[][] jaggedArray) {
        for (int[] row : jaggedArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); 
        }
    }
}

