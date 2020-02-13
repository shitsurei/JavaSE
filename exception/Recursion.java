package exception;

public class Recursion {
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(Fibonacci(i+1)+" ");
		}
		System.exit(0);
	}
	/**
	 * 	阶乘
	 * @param i
	 * @return
	 */
	public static int factorial(int i) {
		if(i>1)
			return i * factorial(i-1);
		return 1;
	}
	/**
	 * 菲波那切数列
	 * @param index
	 * @return
	 */
	public static int Fibonacci(int index) {
		if(index==1||index==2) {
			return 1;
		}else {
			return Fibonacci(index-1)+Fibonacci(index-2);
		}
	}
}
