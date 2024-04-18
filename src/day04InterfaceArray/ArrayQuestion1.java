package day04InterfaceArray;

import java.util.Arrays;

//biggest and second biggest element 
public class ArrayQuestion1 {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 10};
		System.out.println("this was with sorting: " +Arrays.toString(ArrayQuestion1.biggestAndSecondBiggest(arr)));
		System.out.println("without sorting: " +Arrays.toString(ArrayQuestion1.withoutSorting(arr)));
	}
	
	
	public static int[] biggestAndSecondBiggest(int[] arr) {

		int secondBiggest = Integer.MIN_VALUE;		
		Arrays.sort(arr);		//sorted
		
		int biggest = arr[arr.length-1];
		int i = 0;
		while(arr.length > i) {
			
			if(arr[i] != biggest) {
				if(secondBiggest < arr[i]) {
					secondBiggest = arr[i];
				}
			}
			i++;
		}
		
		return new int[] {secondBiggest, biggest};
	}
	
	public static int[] withoutSorting(int[] arr) {
		
		int biggest = Integer.MIN_VALUE;
		int secBiggest = Integer.MIN_VALUE;
		int i = 0;
		int j = 0;
		while(i < arr.length) {
			
			if(biggest < arr[i]) {
				biggest = arr[i];
			}
			i++;
		}
		while(j < arr.length) {
			
			if(biggest != arr[j]) {
				if(secBiggest < arr[j]) {
					secBiggest = arr[j];
				}
			}
			j++;
		}
		
		return new int[] {secBiggest, biggest};
	}
}
