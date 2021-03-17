package typecasting;

public class StringPool {

	
	public static void main(String[] args) {
		String s1 = "Cat";//stp
		s1 = "Cat1";//stp
		String s3 = new String("Cat");//heep
		int a=4;
		a=2;
System.out.println(s1.hashCode());
		//System.out.println("s1 == s2 :" + (s1 == s2));
		System.out.println("s1 == s3 :" + (s1 == s3));
	}

}
