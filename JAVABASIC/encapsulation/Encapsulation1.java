package encapsulation;


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
	t.setMarks(56);
	t.setName("bhusan");
	System.out.println(t.getId());
	System.out.println(t.getMarks());
	System.out.println(t.getName());
	
	}

}
