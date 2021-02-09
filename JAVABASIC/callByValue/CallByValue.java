package callByValue;

class Profound
{
	int id;
	void show(int id )
	{
		this.id=id;
	}
}

public class CallByValue {
	public static void main(String[] args) {
		Profound p=new Profound();
		p.show(23);
	int	d=p.id;
	System.out.println(d);
	}

}