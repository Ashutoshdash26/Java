import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileHandlingCopy {
    public static void main(String[] args){
        try {
            File file=new File("main1.txt");
            if(file.createNewFile()){
                System.out.println("File created : "+ file.getName());
            }else{
                System.out.println("File arlady Exists : "+ file.getName());
            }

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the data in file : ");
            String st=sc.nextLine();
            FileWriter writer=new FileWriter(file,true);
            writer.write(st+"\n");
            writer.close();
            System.out.println("Succefully Wrote the file ");

            

            System.out.println("Reading the file");
            BufferedReader read=new BufferedReader(new FileReader("main1.txt"));
            File copy=new File("Copy1.txt");
            FileWriter wr=new FileWriter("Copy1.txt");
            String line;

            while ((line=read.readLine())!=null) {
                System.out.println(line);
                wr.write(line+"\n");
            }
            read.close();
            wr.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }
}
