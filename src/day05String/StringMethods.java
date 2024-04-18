package day05String;


public class StringMethods {

	public static void main(String[] args) {
		
		String str = " Honesty is the best policy. ";
		String str1 = " honesty is the best policy. ";
		
		System.out.println(str);
		StringMethods.toCharacterArray(str);
		
		System.out.println("indexOf method: " +str.indexOf('o'));
		
		System.out.println("the trim method:" +str.trim());
		
		System.out.println("toLowerCase method: " +str.toLowerCase());
		
		System.out.println("toUpperCase method: " +str.toUpperCase());
		
		System.out.println("subString method: " +str.substring(9, 28));
		
		System.out.println("character replacing method: " +str.replace('H', 'P'));
		
		System.out.println("contains methos: " +str.contains("best"));
		
		System.out.println(".length method: " +str.length());
		
		System.out.println("compareTo method gives unicode value" +str.compareTo(str1));
	
	}
	
	public static void toCharacterArray(String str) {
		
		char[] charArray = str.toCharArray();
		for(char m : charArray) {
			System.out.print(m +", ");
		}
		System.out.println();
	}
}
