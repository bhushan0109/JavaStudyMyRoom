package interface1;

interface A {
	void a();

	void b();

	void c();

	void d();
}

abstract class B implements A {
	
	
	
	  public void c() { System.out.println("I am c"); }
	 
}

class M extends B {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
}

class Bhushan extends M{
	public void a() {
		System.out.println("hellow bhshan");
	}
}

class Test5 {
	public static void main(String args[]) {
		A a = new M();
		M cb = new Bhushan();
		cb.a();
		
		a.a();
		a.b();
		a.c();
		a.d();
	}
}