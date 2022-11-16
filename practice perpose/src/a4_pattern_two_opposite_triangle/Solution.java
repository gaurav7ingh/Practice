package a4_pattern_two_opposite_triangle;

public class Solution {

	public static void printPattern(int N) {
		for (int i = 0; i < N; i++) {
			StringBuilder sb = new StringBuilder("");
			for (int j = 0; j < i; j++) {
				sb.append("*");
			}
			System.out.println(sb.toString());
		}
	}

	public static void main(String[] args) {
		int N = 5;
		printPattern(N);
	}
}
