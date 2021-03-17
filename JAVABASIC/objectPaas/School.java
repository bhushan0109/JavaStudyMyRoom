package objectPaas;

public class School {

	void display(Stud data) {
		System.out.println(data.getName());
		System.out.println(data.getId());

	}

	public static void main(String[] args) {
		Stud s = new Stud("bhu", 25);
		School c = new School();
		c.display(s);

	}
}