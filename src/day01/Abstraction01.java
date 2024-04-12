package day01;

abstract class Bank{
	public abstract void getRateOfInterest();
}

class SBI extends Bank{

	@Override
	public void getRateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println(5);
	}
	
}

class CBIN extends Bank{

	@Override
	public void getRateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println(7);
	}

}



public class Abstraction01 {

	public static void main(String[] args) {
		Bank bn = new SBI();
		bn.getRateOfInterest();
				
		Bank bnk = new CBIN();
		bnk.getRateOfInterest();
		
	}
}
