package practiceconcept;

class A {

	void disp() {
		System.out.println("Class A");
	}
}

class B extends A {
	void show() {
		System.out.println("Class B");
	}
}

class C extends B {
	void getdata() {
		System.out.println("Class C");
	}

	public static void main(String args[]) {
		C obj = new C();
		obj.disp();
		obj.show();
		obj.getdata();
		System.out.println("================ ");
		A obj1 = new C();

		obj1.disp();
		System.out.println("================ ");
		B obj2 = new C();
		obj2.disp();
		obj2.show();

	}
}