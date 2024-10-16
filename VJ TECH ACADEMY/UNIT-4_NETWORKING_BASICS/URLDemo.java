//URL class
import java.net.*;
class URLDemo
{
	public static void main(String args[])throws MalformedURLException
	{
		URL u1=new URL("https://www.vjtechacademy.in:80/about.html");
		System.out.println("Protocal Name:"+u1.getProtocol());
		System.out.println("Host Name:"+u1.getHost());
		System.out.println("Port No:"+u1.getPort());
		System.out.println("File Path:"+u1.getFile());
	}
}
/*
Protocal Name:https
Host Name:www.vjtechacademy.in
Port No:80
File Path:/about.html
*/
