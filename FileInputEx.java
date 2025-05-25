import java.io.FileInputStream;
public class FileInputEx {
    public static void main(String[] args){
         try (FileInputStream f = new FileInputStream("Fibonacci.java");) {
            int j=f.read();

            // byte[] buffer=new byte[10];
            //  f.read(buffer);
             //System.out.println("Buffer content");
            // for(byte b:buffer){
            //     System.out.println((char)b);
            // }
            //while ((j = f.read()) != -1) {
                System.out.print((char)j);
            //}

            byte[] buffer=new byte[10];
             f.read(buffer);
             System.out.println("Buffer content");
            for(byte b:buffer){
                System.out.println((char)b);
            }

            System.out.println("hi");
            f.skip(5);
            int remaining=f.available();
            System.out.println("Remaning bites : "+remaining);
            while ((j = f.read()) !=-1) {
                System.out.print((char) j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
