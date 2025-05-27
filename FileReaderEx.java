import java.io.FileReader;
public class FileReaderEx {
    public static void main(String[] args){
        try {
            
        
        FileReader fi= new FileReader("example.txt");
        int a;
        System.out.println("Content of example.txt");
        while((a=fi.read())!=-1){
            System.out.print((char)a);
        }
        fi.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error occered");
            e.printStackTrace();
        }
    }
}
