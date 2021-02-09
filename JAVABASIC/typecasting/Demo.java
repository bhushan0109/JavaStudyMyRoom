package typecasting;
class Demo {
	//Widening Type Casting
	//In Widening Type Casting, Java automatically converts one data type to another data type.
	/*
	 * Narrowing Type Casting In Narrowing Type Casting, we manually convert one
	 * data type into another using the parenthesis.
	 */
	
	 public static void main(String args[]) {
	  byte x;
	  long d;
	  int a = 3;
	  double b = 5.6;
	  System.out.println("int converted to long");
	  d =  a;
	  System.out.println("a and d  " + a + "        " + d);
	  System.out.println("int converted to byte");
	  x = (byte) a;
	  System.out.println("a and x  " + a + "        " + x);
	  System.out.println("double converted to int");
	  a = (int) b;
	  System.out.println("b and a  " + b + "          " + a);
	  System.out.println("\ndouble converted to byte");
	  x = (byte)b;
	  System.out.println("b and x  " + b + "           " + x);
	 }
	}