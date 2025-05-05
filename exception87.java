public class exception87 {
    public static void main(String[] args) {
        int age = 19; // example age
        try {
            if (age < 18) {
                throw new Exception("Age is less than 18");
            } else {
                System.out.println("Age is valid");
            }
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }

        

    }
}
