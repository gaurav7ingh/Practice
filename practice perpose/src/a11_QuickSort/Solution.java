package a11_QuickSort;

class Solution {

	public static int partition(int[] arr, int low, int high) {
		int index = low;
		int piviot = arr[high];
		for(int i = low; i<high; i++) {
			if(arr[i]<=piviot) {
				swap(arr, i, index);
				index++;
			}
		}
		arr[high] = arr[index];
		arr[index] = piviot;
		return index;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void quicksort(int[] arr, int low, int high) {
		if(low<high) {
			int p = partition(arr, low, high);
			
			quicksort(arr, low, p-1);
			quicksort(arr, p+1, high);
		}
	}
	
	public static void display(int[] arr) {
		for (int each : arr)
			System.out.print(each + " ");
	}

	public static void main(String[] args) {
		int n = 6;
		int[] arr = { 2, 6, 3, 0, 4, 1 };
		quicksort(arr, 0, n - 1);
		display(arr);
	}
}