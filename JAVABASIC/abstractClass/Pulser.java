package abstractClass;


public class Pulser  extends Bike{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("RUN SAFELY");
	}
	public static void main(String[] args) {
		Bike b =new Pulser();
		b.run();
	}
	

}
