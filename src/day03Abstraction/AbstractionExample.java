package day03Abstraction;


//this is to show the abstraction class
public class AbstractionExample extends Vehicle {

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("example abstract class.");
	}
	
	public static void main(String[] args) {
		
		AbstractionExample absCl = new AbstractionExample();
		absCl.move();
		
		Bike bike = new Bike();
		bike.move();
		bike.moveBike();
	}

}

abstract class Vehicle{
	abstract void move();
}

class Bike extends Vehicle{

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle is running.");
	}
	
	public void moveBike() {
		System.out.println("Bike is running.");
	}
	
}