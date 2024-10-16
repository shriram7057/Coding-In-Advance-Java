//Client Program!
import java.net.*;
import java.io.*;
class ClientChat
{
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("Localhost",9090);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		String msg="";
		while (!msg.equals("bye")) 
		{
			msg=br.readLine();
			dout.writeUTF(msg);
			msg=din.readUTF();
			System.out.println("Server Says->"+msg);	
		}
		s.close();
	}
}
