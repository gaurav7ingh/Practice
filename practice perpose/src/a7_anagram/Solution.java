package a7_anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		int n = s.length();
		
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			Character c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < n; i++) {
			Character c = t.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
			} else
				return false;

			if (map.get(c) <= 0)
				map.remove(c);
		}
		if (map.isEmpty())
			return true;
		return false;
	}

	public static void main(String[] args) {
		String a = "abcd";
		String b = "dbca";
		boolean ans = isAnagram(a, b);
		if(ans)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
