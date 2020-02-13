package debug;

/**
 * 五位数的回文数
 * 
 * @author 张国荣
 *
 */
public class Cycle {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.println(i*10000+i+j*1000+j*10+k*100);
				}
			}
		}
	}
}
