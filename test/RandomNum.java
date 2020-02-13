package test;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Random r = new Random();
		//范围[0,10)
		/*int num = r.nextInt(10);
		System.out.println(num);*/
		int num = r.nextInt(100)+1;
		System.out.println("you have 5 oppotunities to guess a integer between 1 and 100");
		boolean defeat = true;
		for(int i=1;i<6;i++) {
			System.out.println("round "+i+"----please input number:");
			int inputNum = sc.nextInt();
			if(inputNum==num) {
				System.out.println("congratulations");
				defeat = false;
				break;
			}else if(inputNum>num){
				 System.out.println("more");
			}else {
				System.out.println("less");
			}
		}
		if(defeat) {
			System.out.println("too sad. real number is "+num);
		}
	}
}
