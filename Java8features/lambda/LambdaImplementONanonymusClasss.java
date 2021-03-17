package lambda;

interface A1 {
	public void show(); // lambda method ko achive akrne ke liye ek him method rayega
}

public class LambdaImplementONanonymusClasss {

	public static void main(String[] args) {
		
		
		
		 A1 lambda = () ->{System.out.println("says lambda");
		 };lambda.show();

	}
}
