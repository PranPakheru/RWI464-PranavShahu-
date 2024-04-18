package day04Interface;

public class InterfaceExample implements RBI {

	@Override
	public int interestRate() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	public static void main(String[] args) {
		
		InterfaceExample exa = new InterfaceExample();
		int intRate = exa.interestRate();
		System.out.println(intRate);
	}

}
