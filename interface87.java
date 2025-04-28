import java.util.Scanner;

interface in {
    public void posneg(int a);
}

class inter implements in {
    public void posneg(int a) {
        if (a >= 0) {
            System.out.println(a + " is a positive number ");
        } else {
            System.out.println(a + " is nagative number");
        }
    }
}

public class interface87 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int as = s.nextInt();
        inter obj = new inter();
        obj.posneg(as);
    }
}