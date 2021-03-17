package abstractClass;

abstract class Pm {
	public abstract void service();

	public void run() {
		System.out.println("MAI STATIC METHID HU");
	}
}

class Cm extends Pm {
	public void service() {
		System.out.println("i m servicing to india");
	}
}

class Person extends Pm {
	public void eat() {
		System.out.println("person eating");
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("servixe person");
	}

}

public class India {
	public static void main(String[] args) {
		Person ob = new Person();
		ob.eat();
		ob.service();
		System.out.println("===========");
		Pm s = new Cm();
		s.service();

		System.out.println("===========");

		Pm a = new Person();
		a.run();
		a.service();

	}
}
