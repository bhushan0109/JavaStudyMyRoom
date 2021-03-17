package abstractClass;
/**
 * Bike the abstract class that contains only one abstract method run. It
 * implementation is provided by the Pulser class.
 */
 abstract class Bike {

 abstract void run();
}


public class Pulser  extends Bike{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("RUN SAFELY");
	}
	public static void main(String[] args) {
		Bike b =new Pulser();//	Pulser b =new Pulser(); we can used also
		
		b.run();
	}
	

}
