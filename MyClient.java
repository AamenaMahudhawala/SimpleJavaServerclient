import java.io.*;
import java.net.*;

public class MyClient {
public static void main(String[] args) {
try{
Socket s=new Socket("localhost",8080);

DataOutputStream dout=new DataOutputStream(s.getOutputStream());

dout.writeUTF("Welcome to Socket Programming");

dout.close();
s.close();

}catch(Exception e){System.out.println(e);}
}
}