package staticMethod;
public class StaticMethod {
	 static int a=8;
	 static int b=5;

		
		/* static { a = 10; b = 20; } */
		 
	 public static void main(String args[]) {

	  System.out.println("Value of a = " + a);
	  System.out.println("Value of b = " + b);

	 	}
	}

	/*
	 * Static method in Java is a method which belongs to the class and not to the
	 * object. A static method can access only static data. It is a method which
	 * belongs to the class and not to the object(instance). A static method can
	 * access only static data. It cannot access non-static data (instance
	 * variables).
	 * 
	 * A static method can call only other static methods and can not call a
	 * non-static method from it. A static method can be accessed directly by the
	 * class name and doesn’t need any object A static method cannot refer to "this"
	 * or "super" keywords in anyway
	 */