package ch18;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
	public static void main(String[] args) {
		InetAddress add1 = null, add2 = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("input host name: ");
		String url = sc.nextLine();

		try {
			add1 = InetAddress.getByName(url);
			add2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(add1.getHostAddress());
		System.out.println(add2.getHostAddress());
	}
}
