package day04InterfaceArray;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
		System.out.println("normal array: " +Arrays.toString(arr));
		System.out.println("without using any method: " +Arrays.toString(ArrayReverse.reverseTheArrayWithoutMethod(arr)));
	}
	
	public static int[] reverseTheArrayWithoutMethod(int[] arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		return arr;
	}
	
}
