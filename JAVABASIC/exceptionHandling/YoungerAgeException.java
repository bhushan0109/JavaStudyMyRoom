package exceptionHandling;

public class YoungerAgeException extends RuntimeException{
	//String msg;

	public YoungerAgeException(String msg) {
		super(msg);//caller method ka exception ko msg chala gaya
		//this.msg = msg;
	}

}
