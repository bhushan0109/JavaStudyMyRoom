package method1;

class Eng
{
	int id;
	float marks;
	String name;
	static String clg="aissms";
	String sub;
	void show(int id,float marks,String name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	void show1(String sub)
	{
		this.show(1, 3.3f, "sathe");
		this.sub=sub;
	}
    void display()
    {
    	System.out.println("Id:"+id+" marks:"+marks+" Name:"+name+" clg:"+clg+" Sub:"+sub);
    }
}
public class Method {
	public static void main(String[] args) {
		Eng e=new Eng();
		e.show1("marathi");
		e.display();
	}

}