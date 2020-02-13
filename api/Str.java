package api;

public class Str {
	public static void main(String[] args) {
		/**
		 * String的构造方法
		 * 1.用字符串常量为参数
		 * 2.用字符数组为参数
		 * 3.直接赋值
		 */
		String s1 = new String("hello");
		System.out.println(s1);
		char[] cs = {'w','o','r','l','d'};
		String s2 = new String(cs);
		System.out.println(s2);
		String s3 = new String(cs, 0, 3);
		System.out.println(s3);
		String s4 = "hell";
		System.out.println(s4);
		/**
		 * 字符串的内容是存储在方法区的常量池里面的，是为了方便字符串的重复使用
		 * 因此s1、s5和s6的值hello都是存储在同一个区域，只不过s1这个变量指向的是堆中的一个String对象的地址，对象中又保存着方法区内hello的地址，而s5和s6直接指向方法区中hello的地址
		 * 故对于相同的字符串常量，new出来的String地址空间不同，而直接赋值的String地址空间相同，都在字符串常量池中
		 */
		String s5 = "hello";
		String s6 = "hello";
		System.out.println(s5==s6);
		
		 //判断函数：
		boolean judge;
		judge = s1.equals(s2);
		judge = s1.equalsIgnoreCase(s2);
		judge = s1.startsWith(s2);
		judge = s1.endsWith(s2);		
		//获取函数
		int length = s1.length();
		char c = s1.charAt(2);
		int index = s1.indexOf(s2);
		s2 = s1.substring(0, 3);
		//转换函数
		cs = s1.toCharArray();
		s1 = s1.toLowerCase();
		s1 = s1.toUpperCase();
		//分割函数
		s1 = s1.trim();
		String[] ss = s1.split(" ");
		
		//字符串每直接赋值一次或拼接一次
		//常量池中就会多一个字符串字面值,这样既耗时又浪费内存空间
		StringBuilder sb = new StringBuilder(s1);
		//添加数据,并返回自身对象
		StringBuilder sb2 = sb.append(s1).append(s2).append(s3);
		System.out.println(sb==sb2);
		//翻转功能,并返回自身对象
		sb.reverse();
		System.out.println(sb.toString());
	}
}
