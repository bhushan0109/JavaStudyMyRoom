package Instance1;


class Abc
{
	 int a=1;
	 static int b=1;
	 void show()
	 {
		 for(int i=1;i<4;i++)
		 {
			 a++;
		 }
		 
		 
		 for(int j=1;j<4;j++)
		 {
			 b++;
		 }
	 }
	 void display()
	 {
		 System.out.println(" "+a);
		 System.out.println(b);
	 }
	 
}
public class Instance
{
	 public static void main(String[] args) {
		Abc s=new Abc();
		s.show();
		s.display();
	}
	 
}