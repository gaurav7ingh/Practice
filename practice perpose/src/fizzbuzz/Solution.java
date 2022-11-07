package fizzbuzz;

public class Solution {
	
	public static void fizzBuzz(int N) {
		
		for(int i = 1; i <= N; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
				System.out.print("FizzBuzz");
			}else if(i % 5 == 0) {
				System.out.print("Buzz");
			}else if(i % 3 == 0) {
				System.out.print("Fizz");
			}else {
				System.out.print(i);
			}
			System.out.print(" ");
		}
		
	}
	
	public static void main(String[] args) {
		int N = 10;
		fizzBuzz(N);
	}
}
