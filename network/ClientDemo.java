package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket(InetAddress.getLocalHost(), 2345);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入用户名：");
		String username = br.readLine();
		System.out.println("请输入密码：");
		String password = br.readLine();
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println(username);
		pw.println(password);
		
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(br.readLine());
		
		br.close();
		pw.close();
		s.close();
	}
}
