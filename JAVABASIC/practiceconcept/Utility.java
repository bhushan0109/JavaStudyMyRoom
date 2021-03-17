package practiceconcept;

import java.util.Scanner;

public class Utility {

	static Scanner sc = new Scanner(System.in);

	public static int IntegerInput() {
		return sc.nextInt();
	}

	public static double doubleInput() {
		return sc.nextDouble();
	}

	public static String stringInput() {
		return sc.nextLine();
	}

	public static Long longInput() {
		return sc.nextLong();
	}
}