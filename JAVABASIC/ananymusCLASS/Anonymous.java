package ananymusCLASS;

class Addition {
	int c;

	public  int add(int a, int b) {
		return   a + b;

	}

	void display() {
		System.out.println(add(4,6));
		System.out.println();


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