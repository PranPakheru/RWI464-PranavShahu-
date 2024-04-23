package day06Exceptions;


public class ArithmeticExceptionExample {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		try {
			int z = x/y;
			System.out.println("the value of: " +z);
		}
		catch(ArithmeticException e) {
			System.out.println("An exception occurred.");
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
