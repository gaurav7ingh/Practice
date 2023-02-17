package a23_twoSumK;

public class Solution {
	public static void main(String[] args) {
		int[] arr = {2,7,12,34,35};
		int k = 9;
		int[] ans = findSum(arr,k);
		System.out.println(ans[0]+", "+ ans[1]);
	}

	private static int[] findSum(int[] arr, int k) {
		int left = 0;
		int right = arr.length-1;
		int sum = 0;
		int[] ans = new int[2];
		while(sum!=k) {
			sum = arr[left] + arr[right];
			if(sum>k) {
				right=right-1;
			}else if(sum<k) {
				left=left+1;
			}else {
				ans[0] = left;
				ans[1] = right;
				return ans;
			}
		}
		ans[0] = left;
		ans[1] = right;
		return ans;
	}
}
