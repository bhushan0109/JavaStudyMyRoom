package practiceconcept;

public class ThisKeyword {
	int a;
	int b;
	public ThisKeyword(int a, int b) {
		
		this.a = a;// this kiya to current class ka instant ko reffer kiya//compile ka confusion dur kiya
		b = b;
	}
	void display() {
		System.out.println("a " +a);
		System.out.println("b "+b);
	}
	public static void main(String[] args) {
		ThisKeyword ob = new ThisKeyword(5,6);
		ob.display();
	}
}
