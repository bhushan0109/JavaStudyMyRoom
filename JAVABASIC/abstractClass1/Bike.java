package abstractClass1;

/***
* Purpose: An abstract class can have data member, abstract method, method
* body, constructor and even main() method.
*
*/

/*If any method declared abstract in a class then class should be abstract else
it will compile time error*/
public abstract class Bike {

	public abstract void run();

	public Bike() {
		System.out.println("Contructor of abstract class Bike..");
	}

	void changeGear() {
		System.out.println("Gears changed..");
	}
}