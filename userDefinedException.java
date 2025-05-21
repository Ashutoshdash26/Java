import java.util.*;

class myexception extends Exception {
    int detail;

    myexception(int a) {
        detail = a;
    }

    public String toString() {
        return "my exception [ " + detail + " ]";
    }
}

public class userDefinedException {
    static void comput(int a) throws myexception{
        System.out.println("called compute");
        if (a > 10) {
            throw new myexception(a);
        }
        System.out.println("Normaly Exit");
    }

    String title;
    String author;

    public userDefinedException(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println(title + " " + author);
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
        try{
        comput(9);
        comput(26);
        }catch(myexception e){
            System.out.println("Caught "+ e);
        }
    }
}
