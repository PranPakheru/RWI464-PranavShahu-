package day06Exceptions;


//works similarly for strings
public class ArrayOrStringIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		
		try {
			int[] arr = new int[3];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[4] = 4;
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] +" ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("there is no index");
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
