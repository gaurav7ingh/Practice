package primeCheck_02;

public class Solution {

	public static boolean primeCheck(int num) {
		if (num == 0 || num == 1 || num == 2)
			return true;
		for (int i = 2; i <= Math.pow(num, 0.5) + 1; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		int num = 15;
		boolean ans = primeCheck(num);
		if (ans)
			System.out.println(num + " Is Prime");
		else
			System.out.println(num + " Is not Prime");
	}

}
