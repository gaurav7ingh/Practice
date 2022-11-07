package com.foobar;

/*
Bomber's

Input: foobar
Output: fbar

Input: abbac
Output: c

Input: abbaaac
Output: c

Input: abbba
Output: aba

*/
import java.util.Scanner;
import java.util.Stack;

public class Foobar {

//	public static String findFoo(String str) {
//		Stack<Character> st = new Stack<>();
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(st.isEmpty())
//				st.push(str.charAt(i));
//			else {
//				if(st.peek() == str.charAt(i))st.pop();
//				else st.push(str.charAt(i));
//			}
//		}
//		String ansString = "";
//		for(char c:st) ansString+=(Character.toString(c));
////		System.out.println(st);
//		return ansString;
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String str = sc.next();
//		String ansString = findFoo(str);
//		System.out.println(ansString);
//		
//		sc.close();
//	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length - 2; ++i)
			System.out.println(arr[i] + " ");

	}
}
