import java.util.*;

public class userDefinedException {

    String title;
    String author;

    public userDefinedException(String title, String author) {
        this.title = title;
        this.author = author;
       // System.out.println(title + " " + author);
    }

    // @Override
    // public String toString() {
    // return "Book[title=" + title + ", author=" + author + "]";
    // }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String stre = s.nextLine();
        System.out.println(stre.toString());
        userDefinedException b = new userDefinedException("title", "author");

        // Displaying the book using toString
        System.out.println("Book details: " + b.toString());
    }
}
