package a7_anagram;

import java.util.Arrays;

public class Solution_II {
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())
			return false;
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		return equalOrNot(a,b);
	}
	public static boolean equalOrNot(char[] a, char[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0;i<a.length; i++) {
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String a = "abcd";
		String b = "dcba";
		boolean ans = isAnagram(a, b);
		if(ans)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
