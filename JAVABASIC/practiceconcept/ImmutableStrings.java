package practiceconcept;



//same name raha to ek hi memory ko point karta hai naya, memory nhi banata hai
public class ImmutableStrings {

	public static void main(String[] args) {
		// ImmutableStrings ob = new ImmutableStrings();
		String a = "bhush";
		String b = "Bhush";
		/*
		 * boolean c= b.compareToIgnoreCase(a); System.out.println(Boolean);
		 */
		System.out.println(a.length());
			System.out.println(a.equals(b));//equals method boolean return karta hai
			System.out.println(a.equalsIgnoreCase(b));//equals method boolean return karta hai

	}
}
//immutable in the sense of memory. It creates new objects every time you create strings or
//assign a new string/change the value.
//That's why it is advisable to be careful when using strings. 
// The object created as a String is stored in the Constant String Pool.in heep memory special type of memory