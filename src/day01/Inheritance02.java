package day01;

//this is going to be used for inheritance

public class Inheritance02 extends Inheritance01{

	public static void main(String[] args) {
		
		//without creation of object
		System.out.println(name);
		System.out.println(id);
		
		//with creation of object
		Inheritance02 inh = new Inheritance02();
		System.out.println(inh.calculate());
	}
}
