package regex;

import java.util.*;

public class WithoutRegexUsername {
	public static void main(String args[]) {

		String s1 = "Hello ";
		String s2 = " How are you?";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String name = sc.nextLine();

		String s3 = s1.concat(name);
		String s4 = s3.concat(s2);
		System.out.println(s4);
	}
}
