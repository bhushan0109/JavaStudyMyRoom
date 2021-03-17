package objectPaas;

public class ToStringExample {
	private String firstName;

	public ToStringExample(String d) {

		this.firstName = d;
		System.out.println(d);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public static void main(String args[]) {
		ToStringExample example = new ToStringExample("bhuthis");
		//System.out.println(example);
		//example.setFirstName("Testing");
	}
}