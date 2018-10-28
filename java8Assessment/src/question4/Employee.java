package question4;

import java.util.Comparator;

public class Employee {

	private int id;
	private String name, address;
	private double salary;

	public Employee(int id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public  static Comparator<Employee> compareBySalary  = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee arg0, Employee arg1) {
			// TODO Auto-generated method stub
			return (int) (arg0.getSalary()-arg1.getSalary());
		}
		
	  
	};
	
   
}