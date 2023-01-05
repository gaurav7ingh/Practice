package a13_FindDuplicateInArray;

public class Solution {
	public static void main(String[] args) {
		int N = 5;
		int[] arr = {1,2,4,3,4};
		findDuplicate(N,arr);
	}

	static void findDuplicate(int n, int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum+=i;
		}
		n = n-1;
		int sum2 = (n*n+n)/2;
		System.out.println(sum-sum2);
	}
}
