//server Program
import java.io.*;
import java.net.*;
class ServerDemo
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(9090);//9090 is the port 
		Socket s1=ss.accept();
		InputStream in=s1.getInputStream();
		int c;
		while ((c=in.read())!=-1)
		{
			System.out.print((char) c);//if you print only c ;then c will display the askey values therefore
									  // char() method used to convert the askey alues into charactor.
		}
		ss.close();//close the stream
	}
}