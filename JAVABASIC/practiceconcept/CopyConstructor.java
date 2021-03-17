package practiceconcept;

public class CopyConstructor {
	int a;
	int b;

	public CopyConstructor(int a, int b) {

		this.a = a;
		this.b = b;
	}

	public CopyConstructor(CopyConstructor s) {
		System.out.println("copy constructor invoked");
		a = s.a;
		b = s.b;

	}

	int add() {
		int c = a + b;
		return c;

	}

	public static void main(String[] args) {
		CopyConstructor ob = new CopyConstructor(2,5);
		System.out.println(ob.add());
		CopyConstructor o = new CopyConstructor(ob);

		

		
	}

}
