package setterAndGetter;

public class Student {
	String name;
	
	public void setName(String a)
	
	{
	name=a;	
	}
	public String getName()
	{
		return name;
	}
	public void display() {
		System.out.println("name player 1: " +name);
	}
}
