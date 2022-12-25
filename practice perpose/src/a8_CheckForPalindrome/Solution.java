package a8_CheckForPalindrome;

import java.util.Scanner;

public class Solution {
	public static boolean isPalindrome(int n,String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = n-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		return s.equals(sb.toString());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		boolean ans = isPalindrome(n,s);
		if(ans)
			System.out.println("This is a valid palindrome");
		else
			System.out.println("This is not a valid palindrome");
		sc.close();
	}
}
