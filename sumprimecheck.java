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

  
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }

    
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
