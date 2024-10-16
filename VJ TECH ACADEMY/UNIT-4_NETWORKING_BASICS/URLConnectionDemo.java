//URL Connection Class
import java.util.*;
import java.net.*;
class URLConnectionDemo
{
	public static void main(String[] args) throws Exception
	{
		URL u1=new URL("https://www.google.com");//URL stands For Uniform Resours Locetor
		URLConnection u2=u1.openConnection();//get the URL Connection
		System.out.println("Content Type:"+u2.getContentType());
		System.out.println("Content Length:"+u2.getContentLength());
		System.out.println("Date:"+new Date(u2.getDate()));
		System.out.println("Expiration Date:"+new Date(u2.getExpiration()));
		System.out.println("Modified Date:"+new Date(u2.getLastModified()));
	}
}	