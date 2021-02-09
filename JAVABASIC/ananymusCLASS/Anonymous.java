package ananymusCLASS;

class Addition {
	int c;

	public void add(int a, int b) {
		c = a + b;

	}

	void display() {
		System.out.println(c);

	}
}

public class Anonymous {
	public static void main(String[] args) {
		/*
		 * new Addition().add(5,7); new Addition().display();
		 */

		Addition ob = new Addition();
		ob.add(22, 34);
		ob.display();

	}
}