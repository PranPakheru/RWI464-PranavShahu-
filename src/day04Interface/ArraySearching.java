package day04Interface;

public class ArraySearching {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int target = 6;
		
		System.out.println("from linear search: " +ArraySearching.linearSearch(arr, target));
		System.out.println();
		System.out.println("from binary search: " +ArraySearching.binarySearch(arr, target));
	}
	
	public static int linearSearch(int[] arr, int target) {
		
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				res = i;
				break;
			}
		}
		return res;
	}
	
	public static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(end >= start) {
			
			int mid = start + (end-start)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] > target) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
}
