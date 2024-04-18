package day04InterfaceArray;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		
		System.out.println("unsorted array: " +Arrays.toString(arr));
		System.out.println("after sorting: " +Arrays.toString(ArraySorting.bubbleSorting(arr)));
		System.out.println("by arrays method: " +Arrays.toString(ArraySorting.byPredefinedMethod(arr)));
	}
	
	public static int[] bubbleSorting(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] byPredefinedMethod(int[] arr) {
		
		Arrays.sort(arr);
		return arr;
	}
}
