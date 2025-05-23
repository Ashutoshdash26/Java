import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;

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
            FileWriter writer=new FileWriter(file,true);
            System.out.println("input in file : "+ file.getName());
            String st=s.nextLine();
            writer.write(st + "\n");  // ✅ Correct newline

            writer.close();
            System.out.println("Successfully wrote to the file");



            System.out.println("Reading from the file ");
            BufferedReader read=new BufferedReader(new FileReader("FHandling.txt"));
            String line=read.readLine();
            while(line!=null){
                System.out.println(line);
                line=read.readLine();
            }
            read.close();


        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occered");
            e.printStackTrace();
        }
    }
}
