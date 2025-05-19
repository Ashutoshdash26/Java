import java.io.*;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.FileReader;
// import java.io.BufferedReader;

public class file {
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            
            FileWriter writer = new FileWriter(myFile);
            writer.write("Hello, this is a sample text written to the file!\n");
            writer.write("You can write multiple lines like this.\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            
            System.out.println("\nFile content:");
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while creating, writing, or reading the file.");
            e.printStackTrace();
        }
    }
}
