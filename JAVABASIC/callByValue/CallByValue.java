package callByValue;

class Test {

	void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
}

public class CallByValue {
	public static void main(String[] args) {

		Test obj = new Test();
		int a = 14;
		int b = 35;
		System.out.println("before calling: " + a + "  " + b);
		obj.swap(a, b);

		System.out.println("before calling: " + a + "  " + b);
	}

}