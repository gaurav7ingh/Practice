package com.gaurav;

import java.util.Stack;

public class sortAnStack {
	
	
	void sort(Stack<Integer> st) {
		if(st.size() == 0) {
			return;
		}
		int temp = st.pop();
		sort(st);
		insert(st,temp);
	}
	
	void insert(Stack<Integer> st, int temp) {
		if(st.size() == 0 || st.peek()<=temp) {
			st.push(temp);
			return;
		}
		int i = st.pop();
		insert(st, temp);
		st.push(i);
		return;
	}
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		st.push(1);
		st.push(9);
		st.push(2);
		st.push(8);
		st.push(3);
		st.push(7);
		st.push(5);
		
		sortAnStack sortAnStack = new sortAnStack();
		
		sortAnStack.sort(st);
		
		for(int i : st) {
			System.out.print(i+" ");
		}
		
	}
}
