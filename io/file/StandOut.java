package io.file;

import java.io.*;

/**
 * 	InputStream标准输入流：字节输入流，用于读取键盘录入的数据
 * 	OutputStream标准输出流：字节输出流，将数据输出到命令行
 */
public class StandOut {
	public static void main(String[] args) throws IOException {
		//创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("C:/worktest/a.txt"));
		//创建输出流对象
		OutputStream os = System.out;
		
		/*String line;
		while((line = br.readLine())!=null) {
			//由于标准输出流是一个字节输出流,只能输出字节或字节数组,但我们读取到的是字符串,如果想输出还需呀转换成字节数组
			os.write(line.getBytes());
			os.write("\r\n".getBytes());
		}*/
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//包装一层高效输出流
		String line;
		while((line = br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		br.close();
		os.close();
		bw.close();
	}
}
