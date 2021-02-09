package object;

public class Account {
	int a;
	int b;

	public Account(int a, int b) {

		this.a = a;
		this.b = b;
	}

	public void add() {
		int add = a + b;
		System.out.println(add);
	}

	public static void main(String[] args) {
		Account ob = new Account(43, 47);
		
		ob.add();
		System.out.println();
	}

}
