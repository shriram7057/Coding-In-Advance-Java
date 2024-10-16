//Server Program!
import java.net.*;
import java.io.*;
class ServerChat
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(9090);
		Socket s1=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataInputStream din=new DataInputStream(s1.getInputStream());
		DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
		String msg="";
		while (!msg.equals("bye")) 
		{
			msg=din.readUTF();
			System.out.println("Client Says->"+msg);
			msg=br.readLine();
			dout.writeUTF(msg);	
		}
	}
}
