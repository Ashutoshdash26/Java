import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LineReader {
    public static void main(String[] args){
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String s;
         try {
            System.out.println("press stop to stop the Execution");
            do {
                 s=(String)br.readLine();
            } while (!s.equals("stop"));
           
         } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error : "+e);
         }
    }
}
