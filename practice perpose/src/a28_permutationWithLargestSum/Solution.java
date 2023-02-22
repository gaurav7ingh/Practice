package a28_permutationWithLargestSum;

import java.util.Arrays;

public class Solution {
	//This function finds permutation with largest sum.
		public static void permutationWithLargestSum(int[] arr){
			Arrays.sort(arr);
			for (int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");
		}
		//Main Function
		public static void main(String[] args){
			int n = 4;
			int[] arr = {3,5,6,1};
	        permutationWithLargestSum(arr);
		}
}
