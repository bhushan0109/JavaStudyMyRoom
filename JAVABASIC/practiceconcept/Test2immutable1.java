package practiceconcept;

public class Test2immutable1 {

	public static void main(String[] args) {

		String a = "a";
		System.out.println("a 1-->" + a);// a 1-->a
		System.out.println("a 1 address-->" + a.hashCode());// a 1 address-->97

		a = "a";
		System.out.println("a 2-->" + a);// a 2-->a

		System.out.println("a 2 address-->" + a.hashCode());// a 2 address-->97
		StringBuffer b = new StringBuffer("Hello");
		//System.out.print(b);
		b.append(", world!");
		System.out.print(b);;
	}
}
//a 1-->a
/*
 * a 1 address-->97 a 2-->a a 2 address-->97
 */