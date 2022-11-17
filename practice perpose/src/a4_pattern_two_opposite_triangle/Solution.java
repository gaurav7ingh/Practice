package a4_pattern_two_opposite_triangle;

public class Solution {

	public static void printPattern(int N) {
		for(int i = 1; i < N; i++) {
			for(int j = i; j < N; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			for(int j = 1; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for(int j = i; j < N; j++) {
				System.out.print("* ");
			}
			for(int j = i; j < N-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int N = 5;
		printPattern(N);
	}
}
