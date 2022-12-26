package a10_BubbleSort;

public class Solution {

	public static void bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,5,2,1};
		bubbleSort(arr);
		for(int i : arr)
			System.out.print(i+" ");
	}
}
