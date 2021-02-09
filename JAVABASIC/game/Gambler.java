package game;

import java.util.*;

public class Gambler {
	static int stake;//initial money
	static int goal;
	static int trials;
	static int bets = 0;
	static int win = 0;
	int win_count = 0;
	// int lose_count=0;

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter initial stake amount :");
		stake = sc.nextInt();

		System.out.println("set the goal amount :");
		goal = sc.nextInt();

		System.out.println("Enter number of times u want to play :");
		trials = sc.nextInt();

		int trail = 0;
		int cash = stake;
		for (int i = 0; i < trail; i++) {
			while (cash > 0 && cash < goal)
				bets++;

			if (Math.random() < 0.5) {
				cash++;
			} else {
				cash--;
			}
			if (cash == goal)
				win++;
		}

		System.out.println("Number of Percentage won..." + 100 * win / trail);
		System.out.println("Average Number of bets..." + 1 * bets / trail);

	}
}