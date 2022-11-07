package com.foobar2;

import java.util.Scanner;
import java.util.Stack;

public class Foober {

	public static String findFoo(int K, String str) {

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			st.push(str.charAt(i));
			if (st.size() >= K)
				st = check(K, st.peek(), st);
			
		}
		System.out.println(st);
		return "";
	}

	public static Stack<Character> check(int K, char c, Stack<Character> st) {
		System.out.println(K+" K");
		System.out.println(st+" st");
		System.out.println(c+" char");
		
		if (K <= 0) return st;
		char ch = st.pop();
		st = check(K-1, c, st);
		if(K > 0)
			st.push(ch);
		return st;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		while (N-- > 0) {
			int K = sc.nextInt();
			String str = sc.next();
			String ans = findFoo(K, str);
			System.out.println(ans);
			N--;
		}

		sc.close();
	}
}
