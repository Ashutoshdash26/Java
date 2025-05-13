import java.util.Scanner;

public class jackeDstring {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString()); // Prints something like: java.lang.Object@1a2b3c4
        jackeDstring am = new jackeDstring();
        System.out.println(am.toString());
        System.out.println("Enter the number of collages");
        Scanner ss = new Scanner(System.in);
        int col = ss.nextInt();
        String[][] arr = new String[col][];
        System.out.println("Enter the number of students");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number of students in " + i);
            int k = ss.nextInt();
            ss.nextLine();
            arr[i] = new String[k];

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the Student name = " + i + " " + j);
                arr[i][j] = ss.nextLine();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("   ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Entered Student name is = " + arr[i][j]);

            }
        }
        ss.close();
    }

    public String toString() {
        System.out.println("String ...");
        return "String ...";
    }
}
