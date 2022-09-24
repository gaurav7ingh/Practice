package com.gaurav;

public class Subset {
	
	static void subset(String str,String ans) {
		if(str.length()== 0) {
			System.out.println(ans);
			return;
		}
		String ans1 = ans;
		String ans2 = ans;
		
		ans2+=(str.substring(0,1));
		
		str = str.substring(1);
		
		subset(str,ans1);
		subset(str,ans2);
		return;
		
	}
	
	public static void main(String[] args) {
		String str = "abc";
//		System.out.println(str.substring(0, 1));
		
		subset(str,"");
	}
}
