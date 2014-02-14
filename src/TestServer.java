import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public TestServer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			final ServerSocket ssocket = new ServerSocket(1337);
			Socket socket=ssocket.accept();
			
			for (int i = 0; i < 100; i++)
			{
				InputStream input=socket.getInputStream();
				InputStreamReader reader = new InputStreamReader(input);
				BufferedReader br=new BufferedReader(reader);
		        char[] buffer = new char[200];
		        int anzahlZeichen = br.read(buffer, 0, buffer.length); // blockiert bis Nachricht empfangen
		        String nachricht = new String(buffer, 0, anzahlZeichen);
				System.out.println(nachricht);
			}
			System.out.println("fertig");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
