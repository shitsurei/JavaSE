package io.file;

import java.io.*;

/**
 * 	将标准输入流的输入数据写入文件
 * @author 张国荣
 *
 */
public class StandIn {
	public static void main(String[] args) throws IOException {
		//创建标准输入流:System.in
		//转换流:把字节输入流转换成字符输入流InputStreamReader
		//缓冲流:对字符流进行包装,提高性能
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//创建高效输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:/worktest/b.txt"));
		
		System.out.println("please input your words and finish with #");
		String line;
		while(true){
			line = br.readLine();
			if(line.charAt(line.length()-1)=='#') {
				bw.write(line.substring(0, line.length()-1));
				bw.flush();
				break;
			}else {
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
		}
		
		//释放资源
		br.close();
		bw.close();
	}
}
