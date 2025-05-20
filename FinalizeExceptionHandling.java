public class FinalizeExceptionHandling {
       public static void main(String[] args) {
        FinalizeExceptionHandling g = new FinalizeExceptionHandling();

        // Making the object eligible for garbage collection
        g = null;

        System.gc(); // Request garbage collection
        System.out.println("End of the garbage collection");
    }

    // Defining the finalize method
    @Override
    protected void finalize() {
        System.out.println("Called the finalize() method");
    }
}
