package ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 斗地主发牌模拟
 * @author 张国荣
 *
 */
public class DouDiZhu {
	public static void main(String[] args) {
		//准备牌
		String[] color = {"♥","♠","♦","♣"};
		String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		List<Card> box = new ArrayList<>();
		for(int i = 0; i <4; i++) {
			for(int j = 0; j <13; j++) {
				box.add(new Card(color[i], number[j]));
			}
		}
		box.add(new Card("大","王"));
		box.add(new Card("小","王"));
		//洗牌
		Collections.shuffle(box);
		//发牌
		for(int i = 0,j=1 ; i < box.size(); i++) {
			if(i%17==0) {
				System.out.println();
				System.out.print("player"+j+":");
				j++;
			}
			System.out.print(box.get(i)+" ");
		}
	}
}

class Card{
	String color;
	String number;
	public Card(String color, String number) {
		super();
		this.color = color;
		this.number = number;
	}

	@Override
	public String toString() {
		return "[" + color + number + "]";
	}
	
}
