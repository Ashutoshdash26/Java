import java.util.Scanner;

interface in {
    public void posneg(int a);

    public void evenadd(int a);

    public void prime(int a);

    public void palindrom(int a);

    public void factorial(int a);
}

class inter implements in {
    public void posneg(int a) {
        if (a >= 0) {
            System.out.println(a + " is a positive number.");
        } else {
            System.out.println(a + " is a negative number.");
        }
    }

    public void evenadd(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is an Even number.");
        } else {
            System.out.println(a + " is an Odd number.");
        }
    }

    public void prime(int a) {
        if (a <= 1) {
            System.out.println(a + " is not a Prime number.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(a + " is a Prime number.");
        } else {
            System.out.println(a + " is not a Prime number.");
        }
    }

    public void palindrom(int a) {
        int original = a;
        int reversed = 0;

        while (a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is not a Palindrome number.");
        }
    }

    public void factorial(int a) {
        if (a < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + a + " is: " + fact);
    }
}

// Main class
public class interface87 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int as = s.nextInt();

        inter obj = new inter();
        obj.posneg(as);
        obj.evenadd(as);
        obj.prime(as);
        obj.palindrom(as);
        obj.factorial(as);

        s.close();
    }
}
