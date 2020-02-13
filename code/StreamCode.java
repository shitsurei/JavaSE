package code;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 	字符流中的编码
 * @author 张国荣
 *	字符流 = 字节流 + 编码
 */
public class StreamCode {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:/worktest/c.txt");
		//转换流在包装时可以选择编码
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("xxx.txt"),"utf-8");
		String s = "中文字符";
		fw.write(s);
		fw.close();
	}
}
