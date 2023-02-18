package a24_maximumSubarray;

public class Solution {
	
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = findMaximumSubarray(arr);
		System.out.println("ans is - "+ ans);
	}

	private static int findMaximumSubarray(int[] arr) {
		int max = arr[0];
		int prefix = 0;
		for(int i = 0; i<arr.length; i++) {
			prefix += arr[i];
			if(prefix > max) {
				max = Math.max(max, prefix);
			}
			if(prefix < 0) {
				prefix = 0;
			}
		}
		return max;
	}
	
}
