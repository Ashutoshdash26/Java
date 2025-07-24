import java.net.*;
import java.io.*;
import java.util.*;


public class ServerTest {
    private ServerSocket ss;
    public static void main(String arg[]) throws IOException{
        ServerTest st=new ServerTest();
        System.out.println("Server Running ");
        for(;;)
        st.serve();
    }
    public ServerTest() throws IOException{
        ss=new ServerSocket(13);
    }
    public void serve() throws IOException{
        Socket s=null;
        s=ss.accept();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        out.write("Day & Time : " +(new Date()).toString());
        out.close();
    }
}
