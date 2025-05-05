import java.util.Scanner;

public class exceptionhandling {
    public static void main(String[] args) {
        Scanner aq = new Scanner(System.in);
        try {
            int q = 10 / 5;
            System.out.println(q);
        } catch (ArithmeticException e) {
            System.out.println("Error : Not posible");
        }
        System.out.println("Enter the age : ");
        int gom = aq.nextInt();
        try {
            if (gom < 18) {
                throw new Exception("under age");

            } else {
                System.out.println("ok age ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
