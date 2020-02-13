package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络通信三要素：
 * IP地址：32位，4字节，点分十进制表示法，分为网络地址和主机地址----InetAddress类
 * 端口号----0~65535
 * 协议----UDP（无连接不可靠，64k大小限制、速度快）、TCP（面向连接可靠，借助管道，安全，效率低）
 */
public class InternetDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia = InetAddress.getByName("DESKTOP-QVSMCVR");
		//获取本机
		InetAddress ia2 = InetAddress.getLocalHost();
		System.out.println(ia);//DESKTOP-QVSMCVR/192.168.1.4
		//获取IP地址
		System.out.println(ia.getHostAddress());
		//获取主机名
		System.out.println(ia.getHostName());
	}
}
