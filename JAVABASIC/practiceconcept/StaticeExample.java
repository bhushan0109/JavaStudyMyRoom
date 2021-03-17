package practiceconcept;

public class StaticeExample {

	 static int a;

	StaticeExample() {
		a++;
	}

	public static void main(String args[]) {

		StaticeExample s1 = new StaticeExample();
		System.out.println("Value of a : " + a);
		StaticeExample s2 = new StaticeExample();
		System.out.println("Value of a : " + a);
		StaticeExample s3 = new StaticeExample();

	
		System.out.println("Value of a : " + a);

		// System.out.println("Value of a : " + a);
	}
}