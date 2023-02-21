package a27_NthFibonacci;

public class Solution {
	public static int nthFibonacci(int n){
	    if (n == 0) return 0;
	    if (n == 1) return 1;
	    return nthFibonacci(n-1) + nthFibonacci(n-2);
	  }
	  //Main Function
	  public static void main(String[] args){
	    int n = 4;
	    System.out.println(nthFibonacci(n));
	  }
}
