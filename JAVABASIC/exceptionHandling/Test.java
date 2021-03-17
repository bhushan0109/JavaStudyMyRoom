package exceptionHandling;

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("provide the division val");
		int n = s.nextInt();
		try {
			System.out.println(10 / n);
			String str = null;
			System.out.println(str.length());
		}
//catch block order is child to parent
	catch (Exception ne) {
		System.out.println("Exception" + ne);
	}
		catch (ArithmeticException ae) {
			System.out.println("Exception" + ae);
		}
		System.out.println("rest of the code");
	}
}