package com.pattern;

//print five  * in colloum 
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++)
			System.out.println("*");

		System.out.println("==========================");
		/*
		 * o/p
		 * 
		 * 
		 * 
		 *
		 *
		 * 
		 * 
		 * end
		 */

		for (int j = 1; j <= 5; j++) {// row
			for (int m = 1; m <= 5; m++) {// colloum
				// System.out.println();
				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println("=========================");

		for (int t = 1; t <= 5; t++) {// row
			for (int p = 4; p >= t; p--) {
				System.out.print("*");

			}
			System.out.println("*");
		}
		System.out.println("=========================");
		for (int l = 1; l <= 5; l++) {// row
		//	for (int s = l; s >= l; s++) {// colloum
				// System.out.println();
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	//}
}