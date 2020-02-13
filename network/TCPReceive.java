package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 使用TCP接收数据
 * @author 张国荣
 *	创建Socket对象，明确端口号
 *	监听（阻塞）
 *	获取输入流对象
 *	获取数据
 *	输出数据
 *	释放资源
 */
public class TCPReceive {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		System.out.println(s.getInetAddress()+"--"+s.getPort());
		is.close();
		br.close();
		s.close();
		//服务端对象可以不关，可能会有多个对象建立连接，请求数据
		ss.close();
	}
}
