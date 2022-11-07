package BinaryRepresentationOfNumber;

public class Solution {
	
	public static String arrToString(int[] arr) {
		StringBuffer ans = new StringBuffer();
		for(int i : arr)
			ans.append(i);
		return ans.toString();
	}
	
	
	public static String binaryRepresentation(int N) {
		int[] arr = new int[32];
		int length = arr.length-1;
		while(N > 0) {
			int temp = N % 2;
			arr[length--] = temp;
			N = N/2;
		}
		return arrToString(arr);
	}
	
	public static void main(String[] args) {
		int N = 7;
		String ans = binaryRepresentation(N);
		
		System.out.println(ans);
	}
}
