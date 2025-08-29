package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 extends Thread {
	protected static boolean cont = true;
	protected Socket connection = null;

	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		server = new ServerSocket(5500);
		System.out.println("Server scoket generated");

		while (cont) {
			System.out.println("waiting connection");
			new EchoServer2(server.accept());
		}
		server.close();
	}

	private EchoServer2(Socket clientSocket) {
		connection = clientSocket;
		start();
	}

	@Override
	public void run() {
		BufferedReader br = null;

		System.out.println("new thread generated");
		try {
			String clientIpAddress = connection.getInetAddress().getHostAddress();
			br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String msg = "";

			while ((msg = br.readLine()) != null) {
				System.out.println(clientIpAddress + "'s message : " + msg);
			}

			br.close();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
