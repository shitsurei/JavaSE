package test;

import java.util.Scanner;

/**
 *  基本数据类型	8种
 *  引用数据类型	数组 类 接口
 *  字符char 占两个字节 可以用于存储一个汉字
 *  整数默认是int 浮点数默认是double
 *  定义long加L，定义float加F，不加编译报错
 *  类型转换：隐式转换（从小到大，小的类型自动提升）	强制转换
*
* int[] arr = new int[3];
 *  栈存储局部变量和变量值对应的内存地址，如int[] arr输出arr得到数组的内存地址
 *  栈内的空间使用完毕立即回收
 *  
 *  堆存储new出来的对象，如new int[3]，每一个堆内存都有一个地址
 *  每一个对象的数据都有默认值，整型是0，浮点型是0.0，字符型是 '\u0000'，boolean类型是false，引用类型是null
 *  堆中的空间使用完毕的堆内存会在垃圾回收器空闲的时候回收
 *  
 *  方法区，类模板的存储区域
 *  对象生成时调用方法区中的类模板在堆中开辟空间存入对象，并赋初值，同时在栈中用变量名指向堆中的对象
 *  成员变量存在堆中，不同对象的成员变量值不同，但成员函数相同，故都存在方法区中，堆中的对象只存储函数的地址，多个对象共享同一个函数地址
 *  调用成员函数时将函数调入栈中，执行完成后销毁栈内空间（main方法在栈中最先开辟，最后销毁）
 *  
 *  成员变量和局部变量的区别
 *  类中位置不同：成员变量在类中方法外，局部变量在方法中或参数中
 *  内存中的位置不同：成员变量在堆内存中（生命周期依赖对象），局部变量在栈内存中（生命周期依赖方法的调用）
 *  成员变量有默认值，局部变量必须初始化
 */
public class Hello {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("input three number");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		System.out.println("Max number:"+compareMax(x1, x2, x3));
	}
	public static int compareMax(int x1,int x2,int x3) {
		int temp = x1>=x2?x1:x2;
		return x3>=temp?x3:temp;
	}
}
