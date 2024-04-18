package day04InterfaceArray;



public class ArrayTwoSum {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 12;
		
		ArrayTwoSum.twoSum(arr, sum);
	}
	
	public static void twoSum(int[] arr, int sum) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(i<arr.length-1) {
					if((arr[i]+arr[j]) == sum) {
						System.out.println("[" +arr[i] +", " +arr[j] +"]");
					}
				}
			}
		}
	}
}
