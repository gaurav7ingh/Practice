package com.gaurav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DeleteMiddleElementFromStack {
	
	void delete(Stack<Integer> st, int k) {
		if(k==1) {
			st.pop();
			return;
		}
		int temp = st.pop();
		delete(st,k-1);
		st.push(temp);
		return;
	}
	
	
	public static void main(String[] args) {
		Stack<Integer> list = new Stack<>();
		Collections.addAll(list, 1,2,3,5,700,5,4,3,2,1);
		
		DeleteMiddleElementFromStack del = new DeleteMiddleElementFromStack();
		int k = list.size()/2+1;
		del.delete(list,k);
		
		System.out.println(list);
	}
}
