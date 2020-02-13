package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceive {
	public static void main(String[] args) throws IOException {
		//创建接收端Socket对象
		DatagramSocket ds = new DatagramSocket(9999);
		byte[] bys = new byte[1024];
		//创建包对象（容器用于接收包对象）
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		//接收数据（阻塞等待）
		ds.receive(dp);
		//解析数据
		//获取发送端IP对象
		InetAddress add = dp.getAddress();
		//获取接收到的数据
		byte[] data = dp.getData();
		//获取具体收到数据的长度
		int len = dp.getLength();
		//输出数据
		System.out.println("sender--->"+add.getHostName());
		System.out.println(new String(data,0,len));
		//释放资源
		ds.close();
	}
}
