package a17_rotateMatrix;

public class Solution {
	
	public static void main(String[] args) {
		int[][] arr =  {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		rotateMatrix(arr);
		
		display(arr);
	}

	private static void display(int[][] arr) {
		
		for(int[] array : arr) {
			for(int num : array) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

	private static void rotateMatrix(int[][] arr) {
		// n is the length of the matrix
		int n = arr.length;
		// m is the length of every row
		int m = arr[0].length;
		
		// this is for changing the variables place
		for(int i = 0;i<n/2; i++) {
			for(int j = i;j<n-i-1; i++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][n-i-1];
				arr[j][n-i-1] = arr[n-i-1][n-j-1];
				arr[n-i-1][n-j-1] = arr[n-j-1][i];
				arr[n-j-1][i] = temp;
			}
		}
		
	}
}
