package encapsulation;

/*
Encapsulation:-
he process of binding the data and code as a single unit is called encapsulation.
Or
The process of hiding the implementation details to user is called encapsulation. 
And we are achieving this concept by declaring variables as a private modifier because 
it is possible to access private members with in the class only.*/
class Test {
	private int id;
	private float marks;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		if (marks > 10) {
			System.out.println("not valid " + marks);

		} else
			this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation1 {
	public static void main(String[] args) {
		Test t = new Test();
		t.setId(20);
		t.setMarks(5);
		t.setName("bhusan");
		t.setName("raj");
		System.out.println(t.getId());
		System.out.println(t.getMarks());
		System.out.println(t.getName());

	}

}
