public class finalize67 {
    protected void finalize() {
        System.out.println("Called the finalize() method");
    }

    public static void main(String[] args) {
        finalize67 g = new finalize67();

        // Making the object eligible for garbage collection
        g = null;

        // Requesting garbage collection
        System.gc();

        System.out.println("End of the garbage collection");
    }
}
