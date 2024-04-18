package day04InterfaceArray;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//initialization
		int[] arr = new int[5];
		int[] arr1 = {6, 7, 8, 9, 10, 11, 12, 13};
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//traversing using loops
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] +" ");
		}
		System.out.println();
		
		//fpr each loop
		for(int m : arr){
			System.out.println(m);
		}
		System.out.println();
		for(int m : arr1) {
			System.out.println(m);
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
	}
}
