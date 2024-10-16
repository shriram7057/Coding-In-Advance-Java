//InetAdress Class
import java.net.*;
class InetAdressDemo
{
	public static void main(String args[])throws UnknownHostException
	{
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println(addr);
		
		addr=InetAddress.getByName("www.facebook.com");
		System.out.println(addr);
		
 		System.out.println("(www.google.com)Is Multicast Addresss="+addr.isMulticastAddress());

		InetAddress address[]=InetAddress.getAllByName("www.google.com");
		for(int i=0;i<address.length;i++)
		{
			System.out.println(address[i]);
		}
	}
}
/*
DESKTOP-RPM9SGB/192.168.1.6
www.facebook.com/163.70.143.35
www.google.com/142.251.42.68
*/
