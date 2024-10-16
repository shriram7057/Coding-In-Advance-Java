//Clint Program
import java.io.*;
import java.net.*;
class ClintDemo
{
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("Localhost",9090);
		OutputStream out=s.getOutputStream();
		byte str[]="Hi Server!".getBytes();//this message send to the server->Hi server!
		out.write(str);//pass the Hi Server string into Bytes
		s.close();
	}
}