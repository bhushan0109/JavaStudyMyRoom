package constructor;

import java.util.Scanner;

class Employee {
	int id ;
	float sal;
	String name;
	String fullnamewithspace;

	Employee(int i, float f, String n, String f1) {
		id = i;
		sal = f;
		name = n;
		fullnamewithspace = f1;
	}

	void display() {
		System.out.println("id:" + id + " sal:" + sal + " name:" + name +  "  fullnamewithspace " + fullnamewithspace);
	}
}

public class Constructor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the name space");
		String f1 = s.nextLine();				//nextline space used for 

		
		System.out.println("enter the id");
		int i = s.nextInt();
		
		System.out.println("enter the salaary");
		float f = s.nextFloat();
		
		System.out.println("enter the name");
		String n = s.next();			///NEXT only for use first name
		
		
		Employee e = new Employee(i, f, n, f1);
		e.display();
	}

}