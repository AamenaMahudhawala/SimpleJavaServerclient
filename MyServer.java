import java.io.*;
import java.net.*;

public class MyServer {
public static void main(String[] args){
try{
ServerSocket ss=new ServerSocket(8080);
Socket s=ss.accept();//establishes connection

DataInputStream MyDataInputStr=new
DataInputStream(s.getInputStream());

String str=(String)MyDataInputStr.readUTF();
System.out.println( "Msg Received : " + str);

ss.close();

}catch(Exception e){System.out.println(e);}
}
}