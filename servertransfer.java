import java.net.*;
import java.io.*;

public class servertransfer {
public static void main (String []args) {
       try {
                ServerSocket ss = new ServerSocket(1999);
                Socket s = ss.accept();
                DataInputStream dis=new DataInputStream(s.getInputStream());
                System.out.println(dis.readUTF());
                } catch (IOException ie) {
                  ie.printStackTrace();
                }
       }
}
