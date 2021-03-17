package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	private String empName;
	private int empID;

	public Employee(String empName, int empID) {
		super();
		this.empName = empName;
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + "]";
	}

}

public class Sort {
	public static void main(String[] args) {

		List<Employee> lst = new ArrayList<>();
		lst.addAll(Arrays.asList(new Employee("bhushan", 12), new Employee("cehtan", 14),

				new Employee("raj", 15),

				new Employee("biswa", 18)

		));
		System.out.println(lst);
		Comparator<Employee> comp =new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		};
		Collections.sort(lst,comp);
		System.out.println(lst);
	//	List<Employee> a=lst.stream().filter(contact -> contact.getEmpName().equals()).

		//Collections.sort(lst,(Employee e1, Employee e2) -> e1.getEmpName().compareTo(e2.ge);

		//List<Employee>lst1=lst.stream().filter(lst ->)
		/*
		 * List<Employee> list = lst.stream().filter(contactName ->
		 * contactName.getEmpName().equals()) .collect(Collectors.toList()); for
		 * (ContactOfPerson contact : list) { System.out.println("First Name: " +
		 * contact.getFirstName()); System.out.println("Last Name: " +
		 * contact.getLastName()); }
		 */
		

	}

}
