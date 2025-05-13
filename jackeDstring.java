public class jackeDstring {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString()); // Prints something like: java.lang.Object@1a2b3c4
        jackeDstring am = new jackeDstring();
        System.out.println(am.toString());
    }

    public String toString() {
        System.out.println("String ...");
        return "String ...";
    }
}
