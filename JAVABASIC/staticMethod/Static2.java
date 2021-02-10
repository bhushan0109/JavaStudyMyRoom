package staticMethod;

class Counting
{
	static int var=0;
	void run()
	{
		var++;
	}
	void display()
	{
		System.out.println(var);
	}
}
public class Static2 {
	public static void main(String[] args) {
		Counting c=new Counting();
		Counting c1=new Counting();
		Counting c2=new Counting();
		c.run();
		c.display();
		c1.run();
		c1.display();
		c2.run();
		
		
		c2.display();
		System.out.println(Counting.var);
		
	}

}