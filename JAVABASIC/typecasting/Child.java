package typecasting;

class Parent {

	public void m1() {
		System.out.println("i m parent m1");
	}

	public void m2() {
		System.out.println("i m parent m2");
	}
}

public class Child extends Parent {

	public void m3() {
		System.out.println("i m child m3");
	}

	public static void main(String[] args) {
		Child ob = new Child();
		ob.m1();// i m parent m1
		ob.m2();// i m parent m2
		ob.m3(); // i m child m3
		System.out.println("===================");
		Parent p = new Child();
		p.m1();
		p.m2();
		// Child ob1 =new Parent();//compile error
		System.out.println("===================");
		// p.m3();///error// not possible to access
		Child c1 = (Child) p;// typecasting
		c1.m3();/// possible //i m child m3
		System.out.println("===================");

		((Child) p).m3(); // i m child m3// also we can do//typecasting
	}
}
