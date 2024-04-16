package day02Association;

import java.util.ArrayList;
import java.util.List;

/*
 * It is a special form of Association where:  

It represents Has-A’s relationship.
It is a unidirectional association i.e. a one-way relationship. For example, 
a department can have students but vice versa is not possible and thus unidirectional in nature.
In Aggregation, both entries can survive individually which means ending one entity will not affect the other entity.
 */


/*
 * Explanation of the above Program:

In this example,

There is an Institute which has no. of departments like CSE, EE. Every department has no. of students.
So, we make an Institute class that has a reference to Object or no. of Objects (i.e. List of Objects) of the Department class.
That means Institute class is associated with Department class through its Object(s).
And Department class has also a reference to Object or Objects (i.e. List of Objects) of the Student class means
 it is associated with the Student class through its Object(s). 
It represents a Has-A relationship. In the above example: Student Has-A name. Student Has-A ID. 
 */
public class AssociationAggregation {

	public static void main(String[] args) {
		
		//creating student objects to create students
		Student std1 = new Student("Pranav", 1);
		Student std2 = new Student("Sonu", 2);
		Student std3 = new Student("Nagarjun", 3);
		Student std4 = new Student("Viplav", 4);
		Student std5 = new Student("Sudhanshu", 5);
		
		//creating department to add department and students
		List<Student> list1 = new ArrayList<>();
		list1.add(std1);
		list1.add(std2);
		
		List<Student> list2 = new ArrayList<>();
		list2.add(std3);
		list2.add(std4);
		list2.add(std5);
		
		Department dpt1 = new Department("Mechanical", list1);
		Department dpt2 = new Department("CSE", list2);
		
		//creating institute object to add institutes
		List<Department> listDpt = new ArrayList<>();
		listDpt.add(dpt1);
		listDpt.add(dpt2);
		
		Institute inst = new Institute("IIT Delhi", listDpt);
		
		
		System.out.println("The number of students in " +inst.getInstName() +" is: " +inst.getNumberOfstudentsInInstitute());
	}
}


//creating students
class Student{
	
	private String stdName;
	private int stdId;
	
	public Student(String stdName, int stdId) {
		this.stdId = stdId;
		this.stdName = stdName;
	}
	
	public String getStdName() {
		return stdName;
	}
	
	public int getStdId() {
		return stdId;
	}
}

//creating department
class Department{
	
	private String dptName;
	private List<Student> students;
	
	public Department(String dptName, List<Student> students) {
		this.dptName = dptName;
		this.students = students;
	}
	
	public String getDeptName() {
		return dptName;
	}
	
	public List<Student> getStudemts(){
		return students;
	}
}

//creating institute
class Institute{
	
	private String insName;
	private List<Department> departments;
	
	public Institute(String insName, List<Department> departments) {
		this.insName = insName;
		this.departments = departments;
	}
	
	public List<Department> getDeptName(){
		return departments;
	}
	
	public String getInstName() {
		return insName;
	}
	
	public int getNumberOfstudentsInInstitute() {
		
		int count = 0;
		List<Student> student = null;
		
		for(Department dpt : departments) {
			student = dpt.getStudemts();
			for(Student std : student) {
				count++;
			}
		}
		return count;
	}
}