package code;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 	编码表
 * @author 张国荣
 *	1.ASCII码表：最早，只有符号数字和字母
 *	2.GB2312：中文+ASCII	---> GBK
 *	3.Unicode：所有字符都占两个字节  ----> UTF-8：长度可变的码表
 *	4.ANSI：本地编码表，与系统环境语言相关
 */
public class EncodeDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * 	java中的字符串默认使用本地编码表ANSI
		 * 	乱码：编码保持前后（读写）一致即可解决
		 */
		String ss = "中文字符";
		//byte数组的构造方法，默认无参构造以本地编码表为准，可传入编码参数
		byte[] bs = ss.getBytes();
		//创建字符串时也可以指定编码
		String sbs = new String(bs, "utf-8");
		//byte[] bs = ss.getBytes("utf-8");
		FileOutputStream fos = new FileOutputStream("C:/worktest/c.txt");
		fos.write(bs);
		fos.close();
	}
}
