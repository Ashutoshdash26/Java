import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
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



        String sc="This is a java code for FileREader , FileWriter";
        Scanner S=new Scanner(System.in);
        System.out.println("Write in the File : ");
        String sit=S.nextLine();
        char [] buf=sit.toCharArray();
        try {
            FileWriter fr=new FileWriter("ex.txt");
            fr.write(sc+"\n");
            fr.write(sit+"\n");
            fr.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
