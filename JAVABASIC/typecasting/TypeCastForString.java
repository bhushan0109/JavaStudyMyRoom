package typecasting;

public class TypeCastForString {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		int a = 1234;
		int b = -1234;
		String str1 = Integer.toString(a);
		String str2 = Integer.toString(b);
		System.out.println("String str1 = " + str1);
		System.out.println("String str2 = " + str2);
		
		String str4 = String.valueOf(a);
	    System.out.println("String str3 = " + str4);
	    
	    int d = 1234;
	    Integer obj = new Integer(d);
	    String str5 = obj.toString();
	    System.out.println("String str4 = " + str5);

	}
}
