package day06Exceptions;



public class NullPointerExceptionExample {

	static NullPointerExceptionExample obj = null;
	int a = 10;
	public static void main(String[] args) {
		
		try {
			System.out.println(obj.a);
		}
		catch(NullPointerException e) {
			System.out.println("an exception occurred.");
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
