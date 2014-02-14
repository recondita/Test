import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	Socket socket;
	String name="Test";
	InputStream input;
	OutputStream output;
	OutputStreamWriter charSender;
	PrintWriter pw;
	
	public Client() {
		try {
			socket = new Socket ("localhost",1337);
			input = socket.getInputStream();
			output= socket.getOutputStream();
			charSender=new OutputStreamWriter(output);
			pw=new PrintWriter(charSender);
			pw.print(name);
			pw.flush();
			pw.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		new Client();
		
	}

}

