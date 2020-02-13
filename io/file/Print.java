package io.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print {
	public static void main(String[] args) {
		/**
		 * 	打印流：
		 * 	也是包装流，不具备写出功能
		 * 	只能输出，不能输入
		 * 1.PrintStream（字节流） 
		 * 2.PrintWriter（字符流）：
		 * 		方法可以自动换行println（），系统无关
		 * 		不能输出字节但是可以输出其他任意类型
		 * 		通过调用部分方法可以实现自动刷新
		 * 		其构造方法会自动将字节流转化为字符流
		 * 	
		 */
		
		try {
			/*PrintWriter pw = new PrintWriter("C:/worktest/a.txt");
			
			pw.write("hello");
			pw.write(97);//根据ASCII码值写字符
			pw.write("java");
			
			pw.println();//输出换行
			pw.println("hello");
			pw.print(123);
			
			pw.close();*/
			
			
			//注意：创建FileWriter是的bool参数表示是否追加写入，创建打印流对象的bool类型参数表示是否自动刷新
			PrintWriter pw2 = new PrintWriter(new FileWriter("C:/worktest/a.txt",true), true);//实现自动刷新
			pw2.println("自动刷新");//输出换行
			pw2.println("hello");
			pw2.print(777);
			
			pw2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
