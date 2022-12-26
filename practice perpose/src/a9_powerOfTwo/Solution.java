package a9_powerOfTwo;

import java.util.Scanner;

public class Solution {
	
	public static boolean isPowerOfTwo(int N) {
		int count = 0;
		while(N>0) {
			if(N%2==1)
				count++;
			N*=0.5;
		}
		return count==1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean ans = isPowerOfTwo(N);
		if(ans)
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}
