package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2345);
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String username = br.readLine();
		String password = br.readLine();
		boolean login = false;
		if(username.equals("zgr")&&password.equals("0215"))
			login = true;
		String message = "登陆失败";
		if(login)
			message = "登陆成功";
		
		PrintWriter pr = new PrintWriter(s.getOutputStream(),true);
		pr.println(message);
		
		pr.close();
		br.close();
		s.close();
		ss.close();
	}
}
