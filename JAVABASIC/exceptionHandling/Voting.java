package exceptionHandling;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the age");
		int age=obj.nextInt();
	try {
		if (age<18)
	
		{
			throw new YoungerAgeException("you r not eligible for voting");
		}
		else {
			System.out.println("you r eligible");
		}
	}catch(YoungerAgeException e)

	{
		e.printStackTrace();
	}
	System.out.println("hello");
}

}
