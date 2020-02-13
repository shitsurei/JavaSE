package api;
/**
 * object是lang包下的类（lang包下均为常用类，不需要导包）
 * @author 张国荣
 * 1.所有的类都默认继承或间接继承object
 * 2.常用方法tostring（返回该对象的字符串表示）
 */
public class Obj {
	public static void main(String[] args) {
		Obj o = new Obj();
		//输出一个对象就是默认输出这个对象的tostring方法
		System.out.println(o);
		System.out.println(o.toString());
		//返回一个字节码对象
		Class c = o.getClass();
		System.out.println(c.getName());
		//返回该对象的内部地址（哈希码值）
		int hash = o.hashCode();
		System.out.println(hash);
		//equals（使用==比较两个对象是否相等，基本的类型比值，引用类型比地址值）
		Obj o2 = new Obj();
		System.out.println(o.equals(o2));
		
		new Obj();
		System.gc();
	}
	@Override
	public String toString() {
		System.out.println("重写tostring方法");
		return super.toString();
	}
	@Override
	public boolean equals(Object arg0) {
		System.out.println("重写equals方法");
		//判断当前传入的参数是否和this是同类对象
		if(this.getClass()!=arg0.getClass())
			System.out.println("对象类型不同");
		return super.equals(arg0);
	}
	//当对象被垃圾回收器回收时调用此方法
	@Override
	protected void finalize() throws Throwable {
		System.out.println("垃圾回收时的收尾工作");
		super.finalize();
	}
}
