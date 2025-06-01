import java.io.RandomAccessFile;
import java.io.IOException;
public class RandomAccessDemo1 {
    public static void main(String[] args) throws IOException{
         RandomAccessFile F1=new RandomAccessFile("randomaccess1.txt","r");
         RandomAccessFile F2=new RandomAccessFile("randomaccess2.txt","rw");

         System.out.println("Second File Length is : "+ F2.length());
         F2.seek(F2.length());

         byte [] File1Array=new byte[200];
         byte [] File2Array=new byte[200];

         F1.read(File1Array,1,50);
         F2.write(File1Array,0,30);

         F2.seek(0);
         F2.read(File2Array);

         System.out.println(new String(File2Array));

         F1.close();
         F2.close();
    }
}
