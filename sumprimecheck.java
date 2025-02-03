import java.util.Scanner;

public class sumprimecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find all special prime numbers up to it: ");
        int num = sc.nextInt();

        System.out.println("Special prime numbers up to " + num + " are:");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i) && isPrime(sumOfDigits(i))) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    //  check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check up to the square root of n
            if (n % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
