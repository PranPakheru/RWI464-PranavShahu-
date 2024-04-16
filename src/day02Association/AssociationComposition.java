package day02Association;

import java.util.ArrayList;
import java.util.List;

/*
 * Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.  
It represents part-of relationship.
In composition, both entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity.
 */

/*
 * In the above example,
A company can have no. of departments.
All the departments are part-of the Company.
So, if the Company gets destroyed then all the Departments within that particular Company will be destroyed, 
i.e. Departments can not exist independently without the Company.
That’s why it is composition. Department is Part-of Company.
 */

public class AssociationComposition {

	public static void main(String[] args) {
		
		//creating company object
		Company techComp = new Company("Microsoft");
		
		techComp.setDepartmentList(new Departments("Human Resource"));
		techComp.setDepartmentList(new Departments("Legal"));
		techComp.setDepartmentList(new Departments("Emgineering"));
		techComp.setDepartmentList(new Departments("Management"));
		
		System.out.println("Total departments are: " +techComp.getDeptSize());
		System.out.println("The department name are: ");
		
		for(Departments dept : techComp.getDepartmentList()) {
			System.out.println(dept.getDeptName());
		}
	}
}

//creating department 
class Departments{
	
	private String deptName;
	
	public Departments(String deptName) {
		this.deptName = deptName;
	}
	
	public String getDeptName() {
		return deptName;
	}
}

//creating company
class Company{
	
	private String compName;
	private List<Departments> deptList;
	
	public Company(String compName) {
		this.compName = compName;
		this.deptList = new ArrayList<Departments>();
	}
	
	public void setDepartmentList(Departments dept) {
		deptList.add(dept);
	}
	
	public List<Departments> getDepartmentList(){
		return new ArrayList<>(deptList);
	}
	
	public int getDeptSize() {
		return deptList.size();
	}
}