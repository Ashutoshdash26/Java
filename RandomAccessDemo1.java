import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
public class RandomAccessDemo1 {
    public static void main(String[] args) throws IOException{


        String sc="This is a test file for RandomAccessFile.\r\n" + //
                        "It contains sample text to demonstrate file reading.\r\n" + //
                        "Java makes file handling powerful and flexible.\r\n" + //
                        "";//
         File f=new File("randomaccess1.txt");
         FileWriter fr=new FileWriter(f);
         fr.write(sc);
         fr.close();

         RandomAccessFile F1=new RandomAccessFile("randomaccess1.txt","r");
         RandomAccessFile F2=new RandomAccessFile("randomaccess2.txt","rw");

         System.out.println("Second File Length is : "+ F2.length());
         F2.seek(F2.length());

         byte [] File1Array=new byte[200];
         byte [] File2Array=new byte[200];

         F1.read(File1Array,0,50);
         F2.write(File1Array,0,30);
         F2.writeBytes("\r\n");
         F2.seek(0);
         F2.read(File2Array);

         System.out.println(new String(File2Array));
         System.out.println(File2Array);


         F1.close();
         F2.close();
    }
}
