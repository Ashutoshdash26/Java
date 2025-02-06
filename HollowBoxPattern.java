import java.util.Scanner;

public class HollowBoxPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the box: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {  
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");  
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();  
        }
        s.close();
    }
}
