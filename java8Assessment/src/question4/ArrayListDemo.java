package question4;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo {

	public ArrayList<Employee> arrayEmp = new ArrayList<Employee>();
	static Employee employee;

	public void fillData() {
		arrayEmp.add(new Employee(01, "Sam", "Banglore", 10));
		arrayEmp.add(new Employee(02, "Tom", "Mumbai", 20));
		arrayEmp.add(new Employee(03, "Vishal", "Delhi", 60));
		arrayEmp.add(new Employee(04, "Joe", "punjab", 50));
		arrayEmp.add(new Employee(05, "JOhn", "Pune", 40));
	}

	public static void main(String[] args) {

		ArrayListDemo arrayListDemo = new ArrayListDemo();
		arrayListDemo.fillData();

		
		arrayListDemo.arrayEmp.forEach(emp -> System.out
				.println("emp id: " + emp.getId() +" NAME :"+ emp.getName() +" ADDRESS: "+ emp.getAddress() +" SALARY: "+ emp.getSalary()));
		
		
		
     Collections.sort(arrayListDemo.arrayEmp,Employee.compareBySalary);
     
     System.out.println("-------- SORTING BASIS ON SALARY----------------");
     System.out.println("------------------------------------------------");
     
     for(Employee emp: arrayListDemo.arrayEmp) {
    	 System.out.println("emp id: " + emp.getId() +" NAME :"+ emp.getName() +" ADDRESS: "+ emp.getAddress() +" SALARY: "+ emp.getSalary());
     }
     
    

	}
}
