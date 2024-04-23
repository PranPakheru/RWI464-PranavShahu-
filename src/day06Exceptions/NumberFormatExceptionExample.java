package day06Exceptions;



public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		try { 

            int num = Integer.parseInt("pranav") ; 
            System.out.println(num); 
        } 
		catch(NumberFormatException e) { 
            System.out.println("that is not a number");
            e.printStackTrace();
			System.out.println(e);
        } 
	}
}
