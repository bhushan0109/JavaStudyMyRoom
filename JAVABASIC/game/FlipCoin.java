package game;

import java.util.*;

public class FlipCoin {
	public static void main(String args[]) {
		double flip;
		double head_count = 0;
		double tail_count = 0;
		double head=1;
		System.out.println("Enter number of times you want to flip coin");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (flip = 1; flip <= input; flip++) {
			double Check = Math.floor(Math.random() * 10) % 2; //1/2 value
			if(Check == 1) {
				head_count++;
			} else {
				tail_count++;
			}
		}
		System.out.println("head_count=" + head_count);
		System.out.println("tail_count=" + tail_count);

		System.out.println("per of heads " + ((head_count * 100)) / input + " %");
		System.out.println("per of tails " + ((tail_count * 100)) / input + " %");
	}
}