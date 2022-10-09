package com.gaurav;

public class kthGrammer {
	
	
	public static int find(int n,int k) {
		 
		if(n==1 && k==1) return n;
		
		int mid = (int) (Math.pow(2, n)-1)/2;
		System.out.println(mid);
		if(k<mid) find(n-1,k);
		else find(n-1,k-mid);
		return -1;
	}
	
	
	public static void main(String[] args) {
		int n = 3;
		int k = 2;
		
		int i =find(n,k);
		
		System.out.println(i);
		
	}
}
