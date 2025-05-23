import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ConsoleReader {
    public static void main(String args[]){
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            char c;
            System.out.println("Type Character");
            do {
                c=(char)br.read();
                if (c != '\n' && c != '\r') {
                    System.out.println("You typed: " + c);
                }
            } while (c!='i');
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error  : "+ e);
        }
    }
}
