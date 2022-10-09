package com.gaurav;

import java.util.Stack;

public class ReverseStack {
	
	public void reverse(Stack<Integer> st) {
		if(st.size()==1) return;
		
		int temp = st.pop();
		reverse(st);
		insert(st,temp);
	}
	
	public void insert(Stack<Integer> st,int temp) {
		if(st.isEmpty()) {
			st.push(temp);
			return;
		}
		int anothertemp = st.pop();
		insert(st, temp);
		st.push(anothertemp);
		return;
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		st.add(5);
		System.out.println(st);
		ReverseStack rs = new ReverseStack();
		rs.reverse(st);
		
		System.out.println(st);

	}
}
