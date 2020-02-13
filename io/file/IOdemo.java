package io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOdemo {
	public static void main(String[] args) {
		/**
		 * IO流分类：
		 * 	按流向进行分类：	输入流	读取数据	Reader
		 * 				输出流	写入数据	Writer
		 * 	按数据类型分类：	字节流（非文本二进制文件只能用字节流读写）	字节输入流InputStream，输出流OutputStream
		 * 				字符流（为了一次读取多个字节，单个字符）	字符输入流Reader，输出流Writer
		 * 
		 * 	原因是不同码表在在对字节合并成字符时会产生丢失，造成二进制文件的损坏
		 */
		//字符流
		/*File dic = new File("C:/worktest");
		File src = new File(dic, "b.txt");
		File des = new File(dic, "a.txt");
		try {
			if(!des.exists())
				des.createNewFile();
			//创建字符输入流对象
			FileReader fr = new FileReader(src);
			//创建字符输出流对象
			FileWriter fw = new FileWriter(des);
			int ch;
			while((ch = fr.read())!=-1) {
				fw.write((char)ch);
				fw.flush();
			}
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		try {
			//创建字节输入流
			FileInputStream fis = new FileInputStream("D:/dva.jpg");
			//创建字节输出流
			FileOutputStream fos = new FileOutputStream("C:/worktest/dva2.jpg");
			int ll;
			//创建缓冲区,加快读写速度
			byte[] bb = new byte[1024];
			while((ll = fis.read(bb))!=-1) {
				//字节流不用刷新缓冲区直接写入
				fos.write(bb);
			}
			//释放资源
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
