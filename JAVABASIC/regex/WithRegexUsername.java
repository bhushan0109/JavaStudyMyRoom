package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
///user ko welcome massage diya hai
public class WithRegexUsername {
	public static String REGEX = "username";
	public static String INPUT = "Hello username , How are you?";

	public static void main(String[] args) {
		System.out.println("Enter The username....");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		INPUT = m.replaceAll(input);
		System.out.println(INPUT);
	}
}