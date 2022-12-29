package a12_BalancedParenthesis;

import java.util.Stack;

public class Solution {

	public static boolean balancedPar(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '(' || c == '[') {
				st.push(c);
			} else {
				switch (c) {
				case '}': {
					if (st.peek() == '{') {
						st.pop();
					} else
						return false;
				}
					break;
				case ']': {
					if (st.peek() == '[') {
						st.pop();
					} else
						return false;
				}
					break;
				case ')': {
					if (st.peek() == '(') {
						st.pop();
					} else
						return false;
				}
					break;
				}
			}
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		String s = "[(])";
		boolean ans = balancedPar(s);
		if(ans)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
