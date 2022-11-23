package a5_rotate_matrix_right_by_one;

public class Solution {

	public static void rotate(int[][] arr, int N) {
		int row = 0;
		int col = 0;
		int maxrow = N-1;
		int maxcol = N-1;
//		display(arr);
		while(row<maxrow && col<maxcol) {
			int pre = arr[row+1][col];
			for(int i = row; i <= maxcol; i++) {
				int temp = arr[row][i];
				arr[row][i] = pre;
				pre = temp;
			}
			row++;
			for(int i = row; i <= maxcol; i++) {
				int temp = arr[i][maxcol];
				arr[i][maxcol] = pre;
				pre = temp;
			}
			maxcol--;
			for(int i = maxcol; i >= col; i--) {
				int temp = arr[maxrow][i];
				arr[maxrow][i] = pre;
				pre = temp;
			}
			maxrow--;
			for(int i = maxrow; i >= col; i--) {
				int temp = arr[i][col];
				arr[i][col] = pre;
				pre = temp;
			}
			col++;
		}
		display(arr);
	}
	
	public static void display(int[][] arr) {
		for(int[] ar : arr) {
			for(int i : ar) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int N = 5;
		int[][] arr = new int[N][N];
		for(int i = 0;i <5; i++) {
			for(int j = 0; j < 5;j++) {
				arr[i][j] = j+1;
			}
		}
		rotate(arr,N);
	}
}
