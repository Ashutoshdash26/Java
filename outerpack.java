import typack.outeriner87;
import java.util.Scanner;

public class outerpack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int a = s.nextInt();
        s.nextLine();
        String arr[] = new String[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the name of " + i);
            arr[i] = s.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" the name of " + i + " is " + arr[i]);

        }

        class Innerouterpack {
            void display() {
                System.out.println(arr[1]);
            }
        }
        Innerouterpack mm = new Innerouterpack();
        mm.display();
        outeriner87 ak = new outeriner87();
        ak.dis();
        outeriner87.pacc kk = new outeriner87().new pacc();
        kk.dis();
        kk.sho(arr);
    }
}
