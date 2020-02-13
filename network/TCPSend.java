package network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 使用TCP发送数据：
 * @author 张国荣
 *	创建发送端Socket对象（创建连接），需要目标设备的IP和端口号
 *	TCP通过IO流发送数据，获取输出流对象
 *	发送数据
 *	释放资源
 */
public class TCPSend {
	public static void main(String[] args) throws IOException, Exception {
		Socket s = new Socket(InetAddress.getLocalHost(), 10086);
		OutputStream os = s.getOutputStream();
		os.write("hello TCP data".getBytes());
		os.close();
		s.close();
	}
}
