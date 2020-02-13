package exception;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 	异常处理机制
 * @author 张国荣
 *	异常：编译或运行时出现的错误，包含错误类型，原因和位置
 *	异常的体系结构：Throwable---Error（不能处理的严重问题），Exception（合理的可以处理的一些问题）
 *	如果出现异常我们没有处理，JVM会自动处理异常
 *	jvm处理异常的方式：将异常信息显示在控制台，同时终止程序
 *	自定义处理异常的方式：捕获，直接抛出（由方法的调用者处理）
 *
 *	异常分类：
 *	1.运行时异常：直接或间接继承了RuntimeException的异常，如空指针，除0，数组越界，在编译时可以选择处理或不处理
 *	2.编译时异常：非RuntimeException的子类，编译时必须处理的异常，捕获或抛出
 *
 *	throw：制造异常，用于方法体中
 *	1.如果生成的是运行时异常，可以不进行处理
 *	2.如果生成的是非运行时异常，必须进行抛出或捕获
 *
 *	throws：抛出异常，用于方法声明中
 *	1.主方法中抛出的异常由虚拟机处理
 *	2.抛出异常时可以抛当前异常及其父类
 *
 *	自定义异常类：
 *	继承Exception类或RuntimeException类，实现其构造方法即可
 */
public class ExceptionDemo {
	public static void main(String[] args){
		
		
		//trycatch执行顺序：执行try中的语句，如果发现异常停止执行，跳入catch语句，处理完后整个trycatch结束；如果没有发现异常不会执行catch中的语句
		//多个异常可以采用多个catch，注意父类异常必须放在子类异常之后
		try {
			judge(0);
			fun();
			System.out.println(2/0);
			System.out.println("after exception");//不执行
			
			String a = null;
			System.out.println(a.length());
		} catch (NullPointerException e) {
			System.out.println("/ by 0");
		} catch (Exception f) {
			System.out.println("ioexception");
			//用于释放资源，清理垃圾等收尾工作，无论trycatch如何执行finally中的代码都会执行
			//注意，finally中的对象不能在try中创建，否则不可见；并且为了确保对象创建成功，要先判断对象是否为null
		} finally {
			System.out.println("finally code");
		}
		System.out.println("after try catch");//执行
	}
	
	public static FileWriter fun() throws IOException{
		FileWriter fw = new FileWriter("filename");//该类的构造方法抛出了一个异常
		return fw;
	}
	
	public static int judge(int aa) throws Exception{
		if(aa==0)
			//throw new RuntimeException("exception message");
		throw new Exception("exception message");//
		return  10/aa;
	}
}
