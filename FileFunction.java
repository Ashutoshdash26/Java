import java.util.Scanner;
import java.io.File;
public class FileFunction {
    public static void main(String[] args){
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the file Name : ");
          String sc=s.nextLine();
          File f=new File(sc);
          if(f.exists()){
              System.out.println("Name: " + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Exists: " + f.exists());
        System.out.println("Can Read: " + f.canRead());
        System.out.println("Can Write: " + f.canWrite());
        System.out.println("Is File: " + f.isFile());
        System.out.println("Is Directory: " + f.isDirectory());
        System.out.println("Is Absolute Path: " + f.isAbsolute());
        System.out.println("Size (bytes): " + f.length());
        System.out.println("Last Modified: " + f.lastModified());
          }else{
            System.out.println("File name is not correct");
          }

        System.out.println("\n");
           System.out.println("File name: " + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Exists: " + f.exists());

        if (f.exists()) {
            System.out.println("Is writable: " + f.canWrite());
            System.out.println("Is readable: " + f.canRead());
            System.out.println("Is a directory: " + f.isDirectory());
            System.out.println("File Size in bytes: " + f.length());
        }
    }
}
