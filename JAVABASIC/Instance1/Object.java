package Instance1;

class Demo {

	int data1;

	public Demo(int data1) {

		this.data1 = data1;
	}

	public Demo() {

	}

	public Demo(Demo d) {
		// TODO Auto-generated constructor stub
	}

}

public class Object {
	public static void main(String[] args) {

		Demo d = new Demo();
		Demo d1 = new Demo(d);
	}

}
