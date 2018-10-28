package question1;

import java.util.ArrayList;

public class ArrayListDemo {

	public ArrayList<Employee> arrayEmp = new ArrayList<Employee>();

	public void fillData() {
		arrayEmp.add(new Employee(01, "Sam", "Banglore", 200000.0));
		arrayEmp.add(new Employee(02, "Tom", "Mumbai", 200000.0));
		arrayEmp.add(new Employee(03, "Vishal", "Delhi", 600000.0));
		arrayEmp.add(new Employee(04, "Joe", "Punjab", 800000.0));
		arrayEmp.add(new Employee(05, "JOhn", "Pune", 9200000.0));
	}

	public static void main(String[] args) {

		ArrayListDemo arrayListDemo = new ArrayListDemo();
		arrayListDemo.fillData();

		arrayListDemo.arrayEmp.forEach(emp -> System.out
				.println("ID "+emp.getId() +" NAME: "+ emp.getName() +" ADDRESS: "+ emp.getAddress() + " SALARY: "+emp.getSalary()));

	}
}
