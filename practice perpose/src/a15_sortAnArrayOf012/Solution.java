package a15_sortAnArrayOf012;

public class Solution {

	private static void sortArray(int[] arr) {
		int zeros = 0;
		int ones = 0;
		int twos = 0;

		for (int i = 0; i<arr.length; i++) {
			if(arr[i]==0) zeros++;
			else if(arr[i]==1) ones++;
			else if(arr[i]==2) twos++;
		}
		
		int i = 0;
		while (zeros > 0) {
			arr[i++] = 0;
			zeros--;
		}
		while (ones > 0) {
			arr[i++] = 1;
			ones--;
		}
		while (twos > 0) {
			arr[i++] = 2;
			twos--;
		}

		for (int integer : arr) {
			System.out.print(integer + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 2, 1 };
		sortArray(arr);
	}
}
