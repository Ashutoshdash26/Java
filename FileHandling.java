import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        try {
            File file=new File("FHandling.txt");
            if (file.createNewFile()) {
                System.out.println("File created : "+file.getName());
            } else {
                System.out.println("File arlady exists "+file.getName());
            }



            Scanner s=new Scanner(System.in);
            FileWriter writer=new FileWriter("FHandling.yxt");
            System.out.println("input in file : "+ file.getName());
            String st=s.nextLine();
            writer.write(st);
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occered");
            e.printStackTrace();
        }
    }
}
