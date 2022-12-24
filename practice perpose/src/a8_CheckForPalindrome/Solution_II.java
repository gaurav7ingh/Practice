package a8_CheckForPalindrome;

import java.util.Scanner;

public class Solution_II {
	public static boolean isPalindrome(String s) {
		int begin = 0;
		int end = s.length()-1;
		while(begin<end) {
			if(s.charAt(begin)!=s.charAt(end))
				return false;
			begin++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = isPalindrome(s);
		if(ans)
			System.out.println("This is a valid palindrome");
		else
			System.out.println("This is not a valid palindrome");
		sc.close();
	}
}
