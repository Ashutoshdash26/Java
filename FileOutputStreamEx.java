import java.io.FileOutputStream;
public class FileOutputStreamEx{
    public static void main(String[] args){
        String s="My Name is Ashutosh Dah And I like to play football and cricket ";
        byte [] b=s.getBytes();
        try {
          FileOutputStream F1=new FileOutputStream("File11.txt");
          
          for(int i=0;i<b.length;i+=2){
            F1.write(b[i]);
          }
          F1.close();

          FileOutputStream f2=new FileOutputStream("File12.txt");
          f2.write(b);
          f2.close();

          FileOutputStream f3=new FileOutputStream("File13.txt");
          //f3.write(b,b.length/2,b.length/4);
          f3.write(b,b.length/2,b.length/4);
          f3.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An Error occured");
            e.printStackTrace();
        }
        
    }
}
