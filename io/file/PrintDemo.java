package io.file;

import java.io.*;

/**
 * 	使用打印流复制文本文件
 * @author 张国荣
 *
 */
public class PrintDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:/worktest/a.txt"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("C:/worktest/b.txt",false), true);
		
		String line;
		while((line = br.readLine())!=null) {
			//自动刷新并换行
			pw.println(line);
		}
		
		br.close();
		pw.close();
	}
}
