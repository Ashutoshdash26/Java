public class ll {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i += 2) { // Iterate through odd numbers only
            int k = i;
            boolean allDigitsOdd = true; // Assume all digits are odd initially

            while (k > 0) {
                int m = k % 10; // Get the last digit
                if (m % 2 == 0) { // If the digit is even
                    allDigitsOdd = false; // Set flag to false
                    break; // Exit the loop
                }
                k = k / 10; // Remove the last digit
            }

            if (allDigitsOdd) { // If all digits are odd
                System.out.println(i); // Print the number
            }
        }
    }
}
