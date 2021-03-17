package callByRefference;

class Test {
	int i;
	int j;

	public Test(int i, int j) {

		this.i = i;
		this.j = j;
	}

	void swap(Test o) {
		int temp = o.i;
		o.i = o.j;
		o.j = temp;
	}
}

public class CallByreference {
	public static void main(String[] args) {

		Test obj = new Test(14, 15);

		System.out.println("before calling: " + obj.i + "  " + obj.j);
		obj.swap(obj);

		System.out.println("before calling: " + obj.i + "  " + obj.j);
	}

}