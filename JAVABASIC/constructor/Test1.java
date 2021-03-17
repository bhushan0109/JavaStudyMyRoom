package constructor;

class Parent {
	int id = 12;
	String name = "raj";
	static String vil = "eklahare";

	/*
	 * Parent(int id, String name){ id=id; name=name;
	 * System.out.println("id: "+id+"name: "+name ); }
	 */

}

class Child {
	String name;
	int id;

	Child(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("id: " + id + "name   " + name + "  village:  " + Parent.vil);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Parent ob = new Parent();

		System.out.println(ob.id + "   " + ob.name + "  village: " + Parent.vil);
		Child name = new Child(24, "bhushan");
	}
} 