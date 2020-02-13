package multi_thread;

/**
 * 	多线程
 * @author 张国荣
 *	进程：当前正在运行的程序，一个应用程序在内存中的执行区域
 *	线程：进程中的一个执行控制单元，执行路径
 *	一个进程可以有一个线程，也可以有多个线程
 *	单线程：安全性高，效率低
 *	多线程：反之
 *
 *	java中线程的生命周期：新建：创建线程对象---就绪：具备执行条件，等待CPU执行---运行：具备执行条件和权利---死亡：线程对象变成垃圾
 *	挂起：wait
 *	唤醒：notify
 */
public class ThreadDemo {
	//主方法是单线程的，调用方法时从哪出就回到哪，再往下执行
	public static void main(String[] args) {
		//创建线程实例
		/*MyThread mt = new MyThread();
		mt.setName("zs");
		MyThread mt2 = new MyThread();
		mt2.setName("ls");
		//启动线程
		mt.start();
		mt2.start();*/
		/**
		 * CPU执行程序的随机性
		 */
		//创建线程实例
		MyThread2 m1 = new MyThread2();
		MyThread2 m2 = new MyThread2();
		//启动线程
		Thread a = new Thread(m1);
		a.setName("zs");
		a.start();
		Thread b = new Thread(m2);
		b.setName("ls");
		b.start();
	}
}

/**
 * 多线程实现方式1：
 * @author 张国荣
 * 继承Thread类，重写run方法
 * 这种方式的缺点在于无法再继承其他类
 */
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(this.getName()+"---"+i);
		}
	}
}

/**
 * 多线程实现方式2：
 * @author 张国荣
 * 实现Runnable接口，实现run方法
 */
class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}
	}
	
}
