import java.net.*;
import java.io.*;
class client
{
public static void main(String args[])throws IOException
{
Socket s = new Socket("localhost",1064);
System.out.println("Enter the radius:");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintStream ps = new PrintStream(s.getOutputStream());
ps.println(br.readLine());
br= new BufferedReader(new InputStreamReader(s.getInputStream()));
String str = br.readLine();
System.out.println("Area of the circe is:");
br.close();
ps.close();
}
}
