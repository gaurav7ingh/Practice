package com.gaurav;

public class PrintBrahma {
	
	static void print(String s,String h,String a,int n) {
		if(n==1) {
			System.out.println("moving from "+s+" to "+a+" of "+n+" th plate");
			return;
		}
		print(s,h,a,n-1);
		System.out.println("moving from "+s+" to "+h+" of "+n+" th plate");
		
		print(h,a,s,n-1);
		System.out.println("moving from "+h+" to "+s+" of "+n+" th plate");
	}
	
	public static void main(String[] args) {
		print("first","sec","third",4);
		
	}
}
