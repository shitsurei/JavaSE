package io.iostream;

import java.io.*;

/**
 * 缓冲流的使用
 * @author 张国荣
 * BufferedWriter：将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入
 * BufferedReader：从字符输入流中读取文本，缓冲各个字符，从而提供单个字符、数组和字符串的高效读取
 */
public class BufferStream {
	public static void main(String[] args) {
		try {
			
			//创建输出缓冲流对象（装饰者模式）
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:/worktest/a.txt"));
			bw.write("aaa");
			//输出缓冲流根据系统自动添加相应的换行符
			bw.newLine();
			bw.flush();
			bw.close();
			
			//创建输入缓冲流对象
			BufferedReader br = new BufferedReader(new FileReader("c:/worktest/a.txt"));
			//一次读写一个字符
			int ch;
			while((ch=br.read())!=-1) {
				System.out.println((char)ch);
			}
			//一次读写一个字符数组
			char[] chs = new char[1024];
			int length;
			while((length=br.read(chs))==chs.length) {
				System.out.println(new String(chs));
			}
			System.out.println(new String(chs,0,length));
			//一次读取一行字符串，不读换行符，故必须用println进行输出
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void copyBufferedStream(String source,String destination) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(source));
			BufferedWriter bw = new BufferedWriter(new FileWriter(destination));
			
			//单个字符读写
			/*int ch;
			while((ch=br.read())!=-1) {
				bw.write(ch);
			}*/
			//字符数组读写
			/*char[] chs = new char[1024];
			int length;
			while((length=br.read(chs))==chs.length) {
				bw.write(chs);
			}
			bw.write(chs, 0, length);*/
			//按行进行读写
			String line;
			while((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
			}
			
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}	
