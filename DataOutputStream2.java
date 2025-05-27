import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class DataOutputStream2{
    public static void main(String[] args){
        try (DataOutputStream doc=new DataOutputStream(new FileOutputStream ("data.bin"));
        DataInputStream dis=new DataInputStream(new FileInputStream("data.bin"));){
            doc.writeDouble(13.6);
            doc.writeInt(10);
            doc.writeBoolean(true);
            doc.writeUTF("Hi This is a java code");
            doc.writeChar('a');

            String sm="This is ashutosh ";
            doc.writeUTF(sm);

            System.out.println("Display : ");


            System.out.println(dis.readDouble());
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
            System.out.println((char)dis.read());
            int k;
            while((k=dis.read())!=-1){
                System.out.print((char)k);
            }

           
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
