package ch18;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("5000 port is waiting");
			Socket connection = server.accept();
			System.out.println("연결됨");
			InputStream is = connection.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			String msg = (String) ois.readObject();
			System.out.println("received message : " + msg);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
