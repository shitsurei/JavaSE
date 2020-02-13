package test;
/**
 * find 水仙花数
 * 153:1,3,3
 * 370:3,0,0
 * 371:3,1,1
 * 407:4,7,7
 * 
 * @author 张国荣
 *
 */
public class Flower {
	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int hundred = i/100;
			int ten = (i-100*hundred)/10;
			int one = (i-100*hundred-10*ten);
			if(i==(hundred*hundred*hundred+ten*ten*ten+one*one*one))
				System.out.println(i+":"+hundred+","+one+","+one);
		}
	}
}
