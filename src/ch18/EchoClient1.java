package ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient1 {
	public static void main(String[] args) throws IOException {
		Socket client = null;
		PrintWriter out = null;
		BufferedWriter bw = null;

		try {
			client = new Socket();
			System.out.println("connecting to server....");
			client.connect(new InetSocketAddress("172.30.1.23", 6500), 3000);
			System.out.println("server connected");
		} catch (Exception e) {
			System.out.println("error");
		}
		Scanner sc = new Scanner(System.in);

		out = new PrintWriter(client.getOutputStream(), true);
		String msg = "";
		System.out.print("message : ");
		while ((msg = sc.nextLine()) != null) {
			if (msg.contains("end")) {
				System.out.println("end client");
				out.close();
				sc.close();
				client.close();
				break;
			}
			out.println(msg);
			System.out.println("message : ");
		}
	}

}