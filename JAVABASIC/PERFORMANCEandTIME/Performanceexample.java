package PERFORMANCEandTIME;

public class Performanceexample {
	static void concatinationWithString() {
		String objectOfString = "Ravi";
		for (int i = 0; i < 10000; i++) {
			objectOfString = objectOfString + "kant";
		}

	}

	static void concatinationWithStringBuffer() {
		StringBuffer objectOfStringBuffer = new StringBuffer("Ravi");
		for (int i = 0; i < 10000; i++) {
			objectOfStringBuffer.append("kant");
		}

	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatinationWithString();
		System.out.println("Time taken by String object = " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		concatinationWithStringBuffer();
		System.out.println("Time taken by StringBuffer = " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
