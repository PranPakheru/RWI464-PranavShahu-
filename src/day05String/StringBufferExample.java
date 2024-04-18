package day05String;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer strBuf = new StringBuffer(" Honesty is the best policy. ");
		
		System.out.println("toString method: " +strBuf.toString());
		
		System.out.println("substring method: " +strBuf.substring(10));
		
		System.out.println("can reverse the string: " +strBuf.reverse());
		strBuf.reverse();
		
		System.out.println("deleting any character: " +strBuf.deleteCharAt(1));
	}
}
