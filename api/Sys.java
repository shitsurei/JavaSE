package api;
/**
 * system类被final修饰，不能被继承
 * @author 张国荣
 * 1.包含一些类字段和方法（静态修饰的成员变量和成员方法）
 * 2.构造被私有，不能被实例化
 * 3.直接用类名访问
 */
public class Sys {
	public static void main(String[] args) {
		int[] arr1 = {1,2,1,3,8};
		int[] arr2 = new int[5];
		//复制数组（源数组，源数组的启示索引位置，目标数组，目标数组的起始索引位置，指定接收的元素个数）
		System.arraycopy(arr1, 0, arr2, 0, 3);//12100
		for(int e : arr2) {			
			System.out.println(e);
		}
		//相对于1970-01-01 00:00:00 以毫秒值返回当前系统时间，可用于测试代码的时间效率
		long ll = System.currentTimeMillis();
		System.out.println(ll);
		//运行垃圾回收器，使虚拟机尽可能的回收垃圾
		System.gc();
		//终止虚拟机，参数0表示正常结束，非零表示异常
		System.exit(0);
	}
}
