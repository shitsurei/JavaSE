package io.iostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * io流
 * @author 张国荣
 * 分类：输入流（读数据），输出流（写数据）
 * 输出流写数据的步骤：
 * 1.创建输出流对象（导包，处理异常）
 * 2.调用输出流对象的写数据方法
 * 3.释放资源
 * 输入流读数据的步骤：
 * 1.创建输入流对象
 * 2.调用输入流对象的读数据方法
 * 3.释放资源
 */
public class IoDemo {
	public static void main(String[] args) {
		try {
			//创建输出流对象：1.调用系统资源创建了一个文件；2.创建输出流对象；3.把输出流对象指向文件
			//只写文件名会采用相对路径，即当前项目文件夹下
			//默认覆盖写入，想追加写入增加append参数为true
			FileWriter fw = new FileWriter("c:/worktest/a.txt",true);
			//将字符串写入内存缓冲区（字符串，开始索引，写入长度）
			fw.write("io stream test\r\n中文文本");
			//写入一个char
			fw.write(97);
			fw.write('\n');
			//刷新缓冲区，写入文件
			fw.flush();
			//先刷新缓冲区，再释放资源，否则系统会判定该文件一直被占用，无法进行删改操作
			fw.close();
			
			//创建输入流对象：
			FileReader fr = new FileReader("c:/worktest/a.txt");
			//用字符串生成器来拼串
			StringBuilder sb = new StringBuilder();
			
			//方式1：循环读入数据，一次读入一个字符，指针自动下移，直到读取的字符为-1
			/*int ch;
			while((ch=fr.read())!=-1) {
				sb.append((char)ch);
			}*/
			
			//方式2：循环读入数据，一次读入一个字符数组，一般采用1024及其整数倍
			char[] chs = new char[50];
			//length用于获取当前读到的字符个数，即当剩余字符不足chs容量个时，只会对数组中前length个字符进行覆盖，剩余字符仍然是上一次读取的字符，故最后一次读取需要进行截串操作
			int length;
			while((length=fr.read(chs))==chs.length) {
				sb.append(chs);
			}
			sb.append(new String(chs,0,length));
			System.out.println(sb);
			//释放资源
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
