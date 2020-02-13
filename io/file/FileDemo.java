package io.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		/**
		 * File对象的三种创建方式
		 * 1.将指定的文件名称转换成一个File对象
		 * 2.根据指定的父路径和文件路径创建对象
		 * 3.根据指定的父路径对象和文件路径创建文件对象
		 */
		File f = new File("C:/worktest/a.txt");
		f = new File("C:/worktest", "a.txt");
		File parent = new File("C:/worktest");
		f = new File(parent, "a.txt");
		/**
		 * File对象常用功能：
		 * 1.创建功能
		 * 2.删除功能
		 * 3.获取功能
		 * 4.判断功能
		 */
		//获取功能
		//以File对象的形式返回当前FIle对象所指向的绝对路径
		System.out.println(f.getAbsoluteFile());
		//返回FIle对象所指向的绝对路径
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParentFile());
		//获取文件和文件夹的名称
		System.out.println(f.getName());
		//根据创建文件的参数路径返回文件路径
		System.out.println(f.getPath());
		//获取文件最后一次的修改时间
		System.out.println(f.lastModified());
		//返回文件的字节数，无法获取文件夹字节数
		System.out.println(f.length());
		//将当前file对象所指向的路径修改为指定file所指向的路径，重名返回false，修改失败
		System.out.println(f.renameTo(new File("C:/worktest/b.txt")));
		//获取当前路径下所有的文件夹和文件名或对象，只有指向文件夹的file对象才能使用该方法
		//File[] file = parent.listFiles();
		String[] files = parent.list();
		for(String e : files) {
			System.out.println(e);
		}
		//获取所有盘符
		File[] fr = File.listRoots();
		for(File e : fr) {
			System.out.println(e);
		}
		//创建功能
		try {
			//指定文件不存在时创建文件并返回true，否则返回false
			System.out.println(f.createNewFile());
			//指定文件夹不存在时创建文件并返回true
			//mkdir只创建一层,mkdirs创建多层
			System.out.println(f.mkdirs());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		//删除功能
		//删除指定文件,文件存在时删除文件并返回true，否则返回false
		//删除文件夹,文件夹不为空时不能删除并返回false
		System.out.println(f.delete());
		//判断功能
		//判断文件是否存在
		System.out.println(f.exists());
		//判断文件是否为隐藏文件
		System.out.println(f.isHidden());
		//判断file对象指向的是否为绝对路径
		System.out.println(f.isAbsolute());
		//判断file对象是否为文件
		System.out.println(f.isFile());
		//判断file对象是否为文件夹
		System.out.println(f.isDirectory());
	}
}
