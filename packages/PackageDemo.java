package packages;

import java.util.List;

/**
 * 包的特点
 * @author 张国荣
 * 1.可以有多层
 * 2.不同包下的文件名可以重复
 * 3.包的声明必须是文件的第一行代码
 */
public class PackageDemo {
	public static void main(String[] args) {
		//相同包下的类可以直接访问
		new Hello().hello();
		//不同包下的类
		//1.可以使用包的全名
		List<Hello> hl = null;
		//2.直接用import把包导入
		List<Hello> hll = null;
		PermissionDemo pd = new PermissionDemo();
		pd.method1();
		pd.method2();
		pd.method3();
		//pd.method4();
	}
}
