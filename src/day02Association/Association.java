package day02Association;

import java.util.HashSet;
import java.util.Set;

/*
 * Association is a relation between two separate classes which is established through their Objects. 
	Association can be one-to-one, one-to-many, many-to-one, many-to-many. 
In Object-Oriented programming, an Object communicates to another object to use functionality and services provided by that object. 
Composition and Aggregation are the two forms of association. 
*/


//In the above example, two separate classes Bank and Employee are associated through their Objects. 
//Bank can have many employees, So, it is a one-to-many relationship.


/*
 * it has 2 types Aggregation and Composition.
 */


public class Association {

	public static void main(String[] args) {
		//creating employee object
		Employee emp1 = new Employee("Pranav");
		Employee emp2 = new Employee("Sonu");
		Employee emp3 = new Employee("Nagarjun");
		
		Set<Employee> employee = new HashSet<>();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		
		Set<Employee> employee1 = new HashSet<>();
		employee1.add(emp3);
		employee1.add(emp2);
		
		//creating bank object and adding employee
		Bank bank1 = new Bank("SBI");
		bank1.setEmploee(employee);
		
		Bank bank2 = new Bank("CBIN");
		bank2.setEmploee(employee1);
		
		//traversing through each one
		for(Employee emp : bank1.getEmployee()) {
			System.out.println(emp.getEmpName() +" belongs to bank: " +bank1.getBankName());
		}
		System.out.println("");
		for(Employee emp : bank2.getEmployee()) {
			System.out.println(emp.getEmpName() +" belongs to bank: " +bank2.getBankName());
		}
	}
}


//crating a bank
class Bank{
	
	private String bankName;
	private Set<Employee> employee;
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	public void setEmploee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	public Set<Employee> getEmployee(){
		return this.employee;
	}
}


//creating employee for bank
class Employee{
	
	private String empName;
	
	public Employee(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return this.empName;
	}
}
