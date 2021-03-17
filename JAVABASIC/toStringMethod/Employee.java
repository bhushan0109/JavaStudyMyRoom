package toStringMethod;

class EmployeeData {
	private String name;
	private int employeeID;
	private double salary;

	public EmployeeData(String name, int employeeID, double salary) {

		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", employeeID=" + employeeID + ", salary=" + salary + "]";
	}

}

public class Employee {
	public static void main(String[] args) {
		EmployeeData ob = new EmployeeData("bhushan", 12, 2334);
		System.out.println(ob);
		// ob.toString();

	}

}