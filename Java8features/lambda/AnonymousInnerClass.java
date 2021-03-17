package lambda;

interface India1 {

	public void sayHellow();// implement main method mai kiya

	public int value(int a);// implement main method mai kiya
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India1 ob = new India1() {

			public void sayHellow() {
				System.out.println("hello i m anonymus class");

			}

			@Override
			public int value(int a) {
				// TODO Auto-generated method stub
				System.out.println(a);
				return a;
			}

		};// yaha close kiya
		ob.sayHellow();
		ob.value(12);

	}
}
