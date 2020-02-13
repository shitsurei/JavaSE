package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * DatagramSocket类基于UDP协议，其构造方法可以指定端口号或随机分配端口号
 * DatagramPacket类表示数据包
 * 
 * UDP协议收发数据注意事项：
 * @author 张国荣
 * 1.端口号错误，数据可以正常发出，不会出现异常，但是收不到
 * 2.端口号不能重复，只能被一个接收端占用，后冲突的程序会出现bindexception异常
 */
public class UDPSend {
	public static void main(String[] args) throws IOException {
		//创建发送端Socket（套接字）对象
		DatagramSocket ds = new DatagramSocket();
		byte[] bys = "hello UDP data".getBytes();
		//创建包对象（打包）
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("zgr"),9999);
		//DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getLocalHost(),9999);
		//发送数据
		ds.send(dp);
		//释放资源
		ds.close();
	}
}
