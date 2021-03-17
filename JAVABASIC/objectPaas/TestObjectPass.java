package objectPaas;

class Student{
	private String  name;
	private int id;
	private int age;
	
	public Student(String name, int id, int age) {
		
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public void display(Student data) {
		System.out.println("name: " +name);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
}


public class TestObjectPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob = new Student();
		ob.display(ob);;
		
	}

}
