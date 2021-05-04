import java.net.*;
import java.io.*;
class Server
{
public static void main(String args[])
{try
{
ServerSocket ss = new ServerSocket(1064);
Socket s = ss. accept();
BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
String str = br.readLine();
double r = Double.parseDouble(str);
double area = 3.14*r*r;
System.out.println(area);
PrintStream ps = new PrintStream(s.getOutputStream());
ps.println(String.valueOf(area));
br.close();
ps.close();
s.close();
ss.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}