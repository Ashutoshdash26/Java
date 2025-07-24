import java.net.*;
import java.io.*;
import java.util.*;
public class ClientTest {
    String Host;
    Socket soc;
    public ClientTest(String phost) throws IOException{
        this.Host=phost;
    }
    public void getData() throws IOException{
        soc=new Socket(Host,13);
        BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(br.readLine());
        br.close();
        soc.close();
    }
    public static void main (String args[])throws IOException{
        ClientTest ct=new ClientTest(args[0]);
        ct.getData();
    }
}
