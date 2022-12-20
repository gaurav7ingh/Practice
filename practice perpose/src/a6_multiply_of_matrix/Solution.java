package a6_multiply_of_matrix;

public class Solution {

	public static void solve(int[][] a, int[][] b,int n, int m) {
		int[][] c = new int[n][m];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				for(int k = 0; k < n;k++) {
					c[i][j] = a[i][k]*a[k][j];
				}
			}
		}
		display(c);
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
		int N = 2;
		int M = 2;
		int[][] a = new int[N][M];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		
		int[][] b = new int[N][M];
		b[0][0] = 4;
		b[0][1] = 5;
		b[1][0] = 6;
		b[1][1] = 7;
		
		solve(a,b,N,M);
		
	}
}
