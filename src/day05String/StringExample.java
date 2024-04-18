package day05String;

public class StringExample {

	public static void main(String[] args) {
		
		String str1 = "Pranav";
		String str3 = new String("Pranav");
		
		
		System.out.println("for == operator");
		if(str1 == str3) {
			System.out.println("str1==str2");
		}
		else {
			System.out.println("not equals");
		}
		
		
		System.out.println("for .equals method");
		if(str1.equals(str3)) {
			System.out.println("str1.equals(str3)");
		}
		else {
			System.out.println("not equals");
		}
		
		
	}
}
