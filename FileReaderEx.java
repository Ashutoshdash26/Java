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
        for(int i=0;i<buf.length;i++){
            System.out.print(buf[i]);
        }



        String sat="This is Time ...";
        char [] arr=new char[sat.length()];
        sat.getChars(0, sat.length(), arr, 0);




        try {
            FileWriter fr=new FileWriter("ex.txt");
            fr.write(sc+"\n");
            fr.write(sit+"\n");
            fr.write(buf);
            fr.write("\n");
            fr.close();


            FileWriter f1=new FileWriter("Filewriter1.txt");
            for(int i=0;i<arr.length;i+=2){
                f1.write(arr[i]);
            }
            f1.close();

            FileWriter f2=new FileWriter("Filewriter2.txt");
            f2.write(arr);
            f2.close();


            FileWriter f3=new FileWriter("FileWriter3.txt");
            f3.write(arr,arr.length/2,arr.length/4);
            f3.close();


            FileReader f4=new FileReader("FileWriter3.txt");
            int vg;
            System.out.println();
            while((vg=f4.read())!=-1){
                System.out.print((char)vg);
            }
            
            f4.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
