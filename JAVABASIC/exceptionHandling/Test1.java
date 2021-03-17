package exceptionHandling;

import java.util.Scanner;
import java.io.*;

public class Test1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		try {
			System.out.println(10 / n);
			System.out.println("ratan".charAt(13));
		} catch (ArithmeticException | ClassCastException a) {
			System.out.println("exception info=" + a);
		} catch (NumberFormatException | NullPointerException | StringIndexOutOfBoundsException a) {
			System.out.println("exception info =" + a);
		}
		System.out.println("Rest of the application");
	}
}