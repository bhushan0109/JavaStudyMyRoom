package object;

public class dog1 {
	String name;
	int age;
	String color;

	/*
	 * public dog1(String name, int age, String color) { super(); this.name = name;
	 * this.age = age; this.color = color; }
	 */
	public static void main(String[] args) {
		dog1 ob = new dog1();
		
		  ob.age = 6; ob.color = "yellow"; ob.name = "pillu";
		 

		System.out.println(ob.getinfo());
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getinfo() {
		return "dog1 [ name=" + name +"" + ", age=" + age + ", color=" + color + "]";
	}
}
