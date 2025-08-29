package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer1 {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket connection = null;
		BufferedReader br = null;

		try {
			server = new ServerSocket(5500);
			System.out.println("server waiting at 5500...");
			connection = server.accept();
			System.out.println("server waiting message...");
			br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String msg = "";

			while ((msg = br.readLine()) != null) {
				if (msg.contains("end")) {
					break;
				}
				System.out.println("message : " + msg);
			}
			br.close();
			connection.close();
			server.close();
			System.out.println("server end");

		} catch (IOException e) {
			System.out.println("error");
		}
	}
}
