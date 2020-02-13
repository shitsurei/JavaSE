package multi_thread;

public class TicketDemo {
	public static void main(String[] args) {
		Ticket ti = new Ticket();
		for(int i = 0 ; i < 20; i++) {
			Thread th = new Thread(ti);
			th.setName("顾客"+(i+1));
			th.start();
		}
	}
	
}

class Ticket implements Runnable{
	private int tickets = 15;
	Object mutex = new Object();
	@Override
	public void run() {
		/**
		 * 同步代码块：
		 * synchronized(锁对象){
		 * 
		 * }
		 * 锁对象要被所有线程共享
		 */
		//synchronized关键字修饰的代码块可用于实现访问互斥，一旦被某个线程访问，直接锁住
		synchronized (mutex) {
			try {
				//sleep方法会使当前线程挂起一段时间 ，这样会造成线程之间在访问资源的时候产生同步互斥的风险，需要给资源加锁解决
				/**
				 * 同步互斥问题产生条件：
				 * 要有多个线程
				 * 要有被多个线程所共享的数据
				 * 多个线程并发的访问共享的数据
				 */
				Thread.sleep(1000);
				//run方法不能声明抛出异常，其中的异常只能捕获
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(tickets>0) {
				tickets--;
				System.out.println(Thread.currentThread().getName()+"---purchase success");
			}else {
				System.out.println(Thread.currentThread().getName()+"---sold out");
			}
		}
	}
	//同步方法的锁对象：非静态是this，静态的是当前类的字节码对象
/*	public synchronized void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(tickets>0) {
			tickets--;
			System.out.println(Thread.currentThread().getName()+"---purchase success");
		}else {
			System.out.println(Thread.currentThread().getName()+"---sold out");
		}
	}
*/	
}
