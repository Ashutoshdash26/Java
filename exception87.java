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
    }
}
