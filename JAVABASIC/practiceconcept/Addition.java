package practiceconcept;

public class Addition implements Operation {

	@Override
	public void addition(int a, int b) {
		int c = a + b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		Operation ob = new Addition();
		//ob.addition(7, 7);
		ob.addition(5, 7);

	}

}