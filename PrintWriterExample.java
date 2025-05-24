import java.io.PrintWriter;
public class PrintWriterExample {
    public static void main(String[] args){
        PrintWriter writer=new PrintWriter(System.out,true);
        writer.println("hello world");
        writer.println("hi "+45);
        writer.printf("Formate : %d %s\n",123,"Example");
        writer.close();
    }
}
