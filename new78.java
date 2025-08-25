import java.util.Scanner;
public class new78 {
    public static void main(String[] args) {
        System.out.println("now");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int a=sc.nextInt();
        System.out.println("The Size of the array is : " +a);
        int ar[]=new int[a];
        System.out.print("Enter "+ a +" number of element in the array : ");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        for(int i=0;i<ar.length;i++){
            //ar[i]=sc.nextInt();
            System.out.print("The element are : ");
            System.out.println(ar[i]);
        }




    //      System.out.print("Enter number of rows: ");
    //     int rows = sc.nextInt();

    //     // Declare jagged array
    //     int[][] jagged = new int[rows][];

    //     // For each row, ask size and fill data
    //     for (int i = 0; i < rows; i++) {
    //         System.out.print("Enter number of columns for row " + (i+1) + ": ");
    //         int cols = sc.nextInt();
    //         jagged[i] = new int[cols];

    //         System.out.println("Enter " + cols + " elements for row " + (i+1) + ": ");
    //         for (int j = 0; j < cols; j++) {
    //             jagged[i][j] = sc.nextInt();
    //         }
    //     }

    //     // Print the jagged array
    //     System.out.println("\nJagged Array Elements:");
    //     for (int i = 0; i < jagged.length; i++) {
    //         for (int j = 0; j < jagged[i].length; j++) {
    //             System.out.print(jagged[i][j] + " ");
    //         }
    //         System.out.println();
    // }



        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        char[][] amm = new char[row][];

        for (int i = 0; i < amm.length; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int col = sc.nextInt();
            amm[i] = new char[col];

            System.out.println("Enter " + col + " characters:");
            for (int j = 0; j < amm[i].length; j++) {
                amm[i][j] = sc.next().charAt(0); 
            }
        }

        // Printing the jagged char array
        System.out.println("\nJagged Char Array:");
        for (int i = 0; i < amm.length; i++) {
            for (int j = 0; j < amm[i].length; j++) {
                System.out.print(amm[i][j] + " ");
            }
            System.out.println();
        }
}
}