import java.util.*;

public class arrrayas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size");
        int size = sc.nextInt();

        int arr[][] = new int[size][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ":");
            int a = sc.nextInt();
            arr[i] = new int[a];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(i + "  " + j + "=");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(i + "  " + j + "=" + arr[i][j]);

            }
        }
    }
}
