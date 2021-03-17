package interface1;

interface Dog {
	public void test();
}

class Pet implements Dog {
	public void test() {
		System.out.println("Interface Method Implemented");
	}

	public static void main(String args[]) {
	Pet p = new Pet ();
	Dog p1 = new Pet ();

		p.test();
		p1.test();
		System.out.println("hello");
	}
}