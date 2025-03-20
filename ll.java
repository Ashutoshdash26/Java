public class ll {
    public static void main(String[] args) {
        for (int i = 1; i < 5000; i += 2) { // Iterate through odd numbers only
            int k = i;
            int sumOfDigits = 0; // To store the sum of all digits
            boolean allDigitsOdd = true; // Assume all digits are odd initially

            while (k > 0) {
                int m = k % 10; // Get the last digit
                sumOfDigits += m; // Add the digit to the sum

                if (m % 2 == 0) { // If the digit is even
                    allDigitsOdd = false; // Set flag to false
                    break; // Exit the loop
                }
                k = k / 10; // Remove the last digit
            }

            // Check if all digits are odd and the sum of digits is also odd
            if (allDigitsOdd && sumOfDigits % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}