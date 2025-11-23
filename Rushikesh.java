//import java.lang.*;
import java.net.*;
import java.io.*;

public class Rushikesh 
{

 

    public static void main(String arg[]) throws Exception
    {
        System.out.println("Server application is running...");
        String s1, s2;

        try (ServerSocket ss = new ServerSocket(1100)) {
            Socket s = ss.accept();
            //ServerSoket ss = new ServerSokest(!000);
            //Socket s = ss.accept();

            
            System.out.println("Connection succesful");
            //System,out.println("connection Sucessful");
            BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
            //BufferReader brk = new BufferReader
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream ps = new PrintStream(s.getOutputStream());
            while((s1 = br.readLine())!= null)
            {
                //System.out.println("Clint Says : ")
                System.out.println("Client Says : "+s1);
                System.out.println("Enter message for client : ");
                s2= brK.readLine();
                ps.println(s2);


            }
        }
    }
}
