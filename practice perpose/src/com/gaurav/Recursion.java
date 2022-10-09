package com.gaurav;

public class Recursion {
	
	void find(int n,int i) {
		if(n==i) {
			System.out.print(n+" ");
			return;
		}
		find(n,i+1);
		System.out.print(i+" ");
	}
	
	public static void main(String[] args) {
		Recursion re = new Recursion();
		re.find(7,1);
	}
}
