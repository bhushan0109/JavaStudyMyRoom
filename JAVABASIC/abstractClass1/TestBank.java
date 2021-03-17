package abstractClass1;

abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class TestBank {
	public static void main(String args[]) {
		// Bank b;
		// b = new SBI();
		Bank b = new SBI();
		//int c = new SBI().getRateOfInterest();
		System.out.println(new SBI().getRateOfInterest());///new asebhi print kar sakte hai
		
		// System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
	Bank	bC = new PNB();
		System.out.println("Rate of IFnterest is: " + bC.getRateOfInterest() + " %");
	}
}